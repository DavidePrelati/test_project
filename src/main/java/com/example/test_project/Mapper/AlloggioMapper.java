package com.example.test_project.Mapper;

import java.util.Base64;
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
        
        // MODIFICA QUI: Invece del nome file, passa la Base64
        if (a.getImmagini() != null && !a.getImmagini().isEmpty()) {
            immagineModel primaImmagine = a.getImmagini().get(0);
            
            // Converti il contenuto byte[] in Base64
            if (primaImmagine.getContenuto() != null && primaImmagine.getContenuto().length > 0) {
                String base64 = Base64.getEncoder().encodeToString(primaImmagine.getContenuto());
                dto.setImmaginePrincipale("data:image/jpeg;base64," + base64);
            } else {
                dto.setImmaginePrincipale("https://via.placeholder.com/400x250");
            }
        } else {
            dto.setImmaginePrincipale("https://via.placeholder.com/400x250");
        }
        
        if (a.getRecensioni() != null && !a.getRecensioni().isEmpty()) {
            double media = a.getRecensioni()
                    .stream()
                    .mapToInt(recensioneModel::getValutazione)
                    .average()
                    .orElse(0);
            dto.setRatingMedio(media);
        } else {
            dto.setRatingMedio(0);
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

	 // Sostituisci il vecchio dto.setImmagini(...) nel metodo toAllDettDTO
	    dto.setImmagini(
	        a.getImmagini().stream()
	         .map(img -> {
	             if (img.getContenuto() != null && img.getContenuto().length > 0) {
	                 // Trasformiamo i byte del database in stringa Base64
	                 String base64 = java.util.Base64.getEncoder().encodeToString(img.getContenuto());
	                 return "data:image/jpeg;base64," + base64;
	             } else {
	                 // Se l'immagine è vuota, mettiamo un placeholder
	                 return "https://via.placeholder.com/400x250";
	             }
	         })
	         .collect(java.util.stream.Collectors.toList())
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
