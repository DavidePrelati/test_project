package com.example.test_project.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="recensione")
public class recensioneModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idrecensione;
	
	private int valutazione;
	private String commento;
	private LocalDate data_recensione;
	
	@ManyToOne
	@JoinColumn(name="id_utente")
	private utenteModel utente;
	
	@ManyToOne
	@JoinColumn(name="id_alloggio")
	private alloggioModel alloggio;
	
	public recensioneModel() {
		
	}

	public long getIdrecensione() {
		return idrecensione;
	}

	public void setIdrecensione(long idrecensione) {
		this.idrecensione = idrecensione;
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

	public LocalDate getData_recensione() {
		return data_recensione;
	}

	public void setData_recensione(LocalDate data_recensione) {
		this.data_recensione = data_recensione;
	}

	public utenteModel getUtente() {
		return utente;
	}

	public void setUtente(utenteModel utente) {
		this.utente = utente;
	}

	public alloggioModel getAlloggio() {
		return alloggio;
	}

	public void setAlloggio(alloggioModel alloggio) {
		this.alloggio = alloggio;
	}
	
	

}
