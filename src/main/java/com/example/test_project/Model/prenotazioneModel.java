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
@Table(name="prenotazione")
public class prenotazioneModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idprenotazione;
	
	private LocalDate data_checkin;
	private LocalDate data_checkout;
	private int num_ospiti;
	private double prezzo;
	private int stato;
	
	@ManyToOne
	@JoinColumn(name="id_utente")
	private utenteModel utente;
	
	@ManyToOne
	@JoinColumn(name="id_alloggio")
	private alloggioModel alloggio;

	public prenotazioneModel() {
	}

	public long getIdprenotazione() {
		return idprenotazione;
	}

	public void setIdprenotazione(long idprenotazione) {
		this.idprenotazione = idprenotazione;
	}

	public LocalDate getData_checkin() {
		return data_checkin;
	}

	public void setData_checkin(LocalDate data_checkin) {
		this.data_checkin = data_checkin;
	}

	public LocalDate getData_checkout() {
		return data_checkout;
	}

	public void setData_checkout(LocalDate data_checkout) {
		this.data_checkout = data_checkout;
	}

	public int getNum_ospiti() {
		return num_ospiti;
	}

	public void setNum_ospiti(int num_ospiti) {
		this.num_ospiti = num_ospiti;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getStato() {
		return stato;
	}

	public void setStato(int stato) {
		this.stato = stato;
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