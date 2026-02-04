package com.example.test_project.DTO;

import java.time.LocalDate;

public class RecensioneDettaglioDTO {
	
	private String nomeUtente;
	private int valutazione;
	private String commento;
	private LocalDate dataRecensione;
	
	public RecensioneDettaglioDTO() {
		
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public int getValutazione() {
		return valutazione;
	}

	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}

	public LocalDate getDataRecensione() {
		return dataRecensione;
	}

	public void setDataRecensione(LocalDate dataRecensione) {
		this.dataRecensione = dataRecensione;
	}
	
	

}
