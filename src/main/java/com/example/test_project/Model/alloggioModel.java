package com.example.test_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alloggio")
public class alloggioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titolo;
	private String descrizione;
	private String indirizzo;
	private String citta;
	private int cap;
	private String paese;
	private double prezzo;
	private int num_ospiti;
	private long id_utente;
	
	public alloggioModel(long id, String titolo, String descrizione, String indirizzo, String citta, int cap,
			String paese, double prezzo, int num_ospiti, long id_utente) {
		this.id = id;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.cap = cap;
		this.paese = paese;
		this.prezzo = prezzo;
		this.num_ospiti = num_ospiti;
		this.id_utente = id_utente;
	}
	
	
	public alloggioModel() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public int getCap() {
		return cap;
	}
	
	public void setCap(int cap) {
		this.cap = cap;
	}
	
	public String getPaese() {
		return paese;
	}
	
	public void setPaese(String paese) {
		this.paese = paese;
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
	
	public long getId_utente() {
		return id_utente;
	}
	
	public void setId_utente(long id_utente) {
		this.id_utente = id_utente;
	}
	
	

}
