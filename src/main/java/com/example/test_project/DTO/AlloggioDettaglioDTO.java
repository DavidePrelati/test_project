package com.example.test_project.DTO;

import java.util.List;

public class AlloggioDettaglioDTO {
	
	private long idAlloggio;
	private String titolo;
	private String descrizione;
	private String indirizzoCompleto;
	private double prezzo;
	private int num_ospiti;
	
	private List<String> immagini;
	private double ratingMedio;
	private List<RecensioneDettaglioDTO> recensioni;
	private String nomeHost;

	public AlloggioDettaglioDTO() {
	}

	public long getIdAlloggio() {
		return idAlloggio;
	}

	public void setIdAlloggio(long idAlloggio) {
		this.idAlloggio = idAlloggio;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getIndirizzoCompleto() {
		return indirizzoCompleto;
	}

	public void setIndirizzoCompleto(String indirizzoCompleto) {
		this.indirizzoCompleto = indirizzoCompleto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getNumOspiti() {
		return num_ospiti;
	}

	public void setNumOspiti(int num_ospiti) {
		this.num_ospiti = num_ospiti;
	}

	public List<String> getImmagini() {
		return immagini;
	}

	public void setImmagini(List<String> immagini) {
		this.immagini = immagini;
	}

	public double getRatingMedio() {
		return ratingMedio;
	}

	public void setRatingMedio(double ratingMedio) {
		this.ratingMedio = ratingMedio;
	}

	public List<RecensioneDettaglioDTO> getRecensioni() {
		return recensioni;
	}

	public void setRecensioni(List<RecensioneDettaglioDTO> recensioni) {
		this.recensioni = recensioni;
	}

	public String getNomeHost() {
		return nomeHost;
	}

	public void setNomeHost(String nomeHost) {
		this.nomeHost = nomeHost;
	}
	
	
}
