package com.example.test_project.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "alloggio")
	private List<prenotazioneModel> prenotazioni;
	
	@OneToMany(mappedBy = "alloggio")
	private List<immagineModel> immagini;
	
	@OneToMany(mappedBy = "alloggio")
	private List<recensioneModel> recensioni;
	
	@OneToMany(mappedBy = "alloggio")
	private List<alloggioServizioModel> alloservi;
	
	@ManyToOne
	@JoinColumn(name="id_utente")
	private utenteModel utente;
	
	
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


	public List<prenotazioneModel> getPrenotazioni() {
		return prenotazioni;
	}


	public void setPrenotazioni(List<prenotazioneModel> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}


	public List<immagineModel> getImmagini() {
		return immagini;
	}


	public void setImmagini(List<immagineModel> immagini) {
		this.immagini = immagini;
	}


	public List<recensioneModel> getRecensioni() {
		return recensioni;
	}


	public void setRecensioni(List<recensioneModel> recensioni) {
		this.recensioni = recensioni;
	}


	public List<alloggioServizioModel> getAlloservi() {
		return alloservi;
	}


	public void setAlloservi(List<alloggioServizioModel> alloservi) {
		this.alloservi = alloservi;
	}


	public utenteModel getUtente() {
		return utente;
	}


	public void setUtente(utenteModel utente) {
		this.utente = utente;
	}
	
	
}
