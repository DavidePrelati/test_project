package com.example.test_project.Mapper;

import com.example.test_project.DTO.RecensioneDettaglioDTO;
import com.example.test_project.Model.recensioneModel;

public class RecensioneMapper {
	
	public static RecensioneDettaglioDTO toRecDTO(recensioneModel r) {
		RecensioneDettaglioDTO recDTO = new RecensioneDettaglioDTO();
		
		recDTO.setNomeUtente(r.getUtente().getNome() + " " + r.getUtente().getCognome());
		recDTO.setCommento(r.getCommento());
		recDTO.setValutazione(r.getValutazione());
		recDTO.setDataRecensione(r.getDataRecensione());
		
		return recDTO;
	}

}
