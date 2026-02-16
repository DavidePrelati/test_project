package com.example.test_project.Mapper;

import java.util.stream.Collectors;

import com.example.test_project.DTO.AlloggioDTO;
import com.example.test_project.DTO.AlloggioDettaglioDTO;
import com.example.test_project.Model.alloggioModel;
import com.example.test_project.Model.immagineModel;
import com.example.test_project.Model.recensioneModel;

public class AlloggioMapper {
	
	public static AlloggioDTO toAlloggiDTO(alloggioModel a) {
		AlloggioDTO dto = new AlloggioDTO();
		
		dto.setIdAlloggio(a.getIdAlloggio());
		dto.setTitolo(a.getTitolo());
		dto.setDescrizione(a.getDescrizione());
		dto.setPrezzo(a.getPrezzo());
		dto.setNum_ospiti(a.getNum_ospiti());
		
		dto.setIndirizzoCompleto(a.getIndirizzo() + " " + 
		a.getCap() + " " + a.getCitta() + ", " + a.getPaese());
		
		
		if (a.getImmagini() != null && !a.getImmagini().isEmpty()) {
            dto.setImmaginePrincipale(
                a.getImmagini().get(0).getNomefile()
            );
        }

		
        if (a.getRecensioni() != null && !a.getRecensioni().isEmpty()) {
            double media = a.getRecensioni()
                    .stream()
                    .mapToInt(recensioneModel::getValutazione)
                    .average()
                    .orElse(0);
            dto.setRatingMedio(media);
        }
        		
		return dto;
	}

	
	public static AlloggioDettaglioDTO toAllDettDTO(alloggioModel a) {

	    AlloggioDettaglioDTO dto = new AlloggioDettaglioDTO();

	    dto.setIdAlloggio(a.getIdAlloggio());
	    dto.setTitolo(a.getTitolo());
	    dto.setDescrizione(a.getDescrizione());
	    dto.setPrezzo(a.getPrezzo());
	    dto.setNumOspiti(a.getNum_ospiti());

	    dto.setIndirizzoCompleto(
	        a.getIndirizzo() + ", " +
	        a.getCap() + " " +
	        a.getCitta() + " (" +
	        a.getPaese() + ")"
	    );

	    dto.setImmagini(
	        a.getImmagini()
	         .stream()
	         .map(immagineModel::getNomefile)
	         .collect(Collectors.toList())
	    );

	    dto.setRatingMedio(
	        a.getRecensioni()
	         .stream()
	         .mapToInt(recensioneModel::getValutazione)
	         .average()
	         .orElse(0)
	    );

	    dto.setRecensioni(
	        a.getRecensioni()
	         .stream()
	         .map(RecensioneMapper::toRecDTO)
	         .collect(Collectors.toList())
	    );

	    dto.setNomeHost(a.getUtente().getNome());

	    return dto;
	}


}
