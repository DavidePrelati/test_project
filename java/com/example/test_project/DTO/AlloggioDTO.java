package com.example.test_project.DTO;

public class AlloggioDTO {
	
	private long idAlloggio;
	private String titolo;
	private String descrizione;
	private String indirizzoCompleto;
	private String immaginePrincipale;
	private double prezzo;
	private int num_ospiti;
	private double ratingMedio;
	
	public AlloggioDTO() {
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

	public String getImmaginePrincipale() {
		return immaginePrincipale;
	}

	public void setImmaginePrincipale(String immaginePrincipale) {
		this.immaginePrincipale = immaginePrincipale;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getNum_ospiti() {
		return num_ospiti;
	}

	public void setNum_ospiti(int num_ospiti) {
		this.num_ospiti = num_ospiti;
	}

	public double getRatingMedio() {
		return ratingMedio;
	}

	public void setRatingMedio(double ratingMedio) {
		this.ratingMedio = ratingMedio;
	}

}
