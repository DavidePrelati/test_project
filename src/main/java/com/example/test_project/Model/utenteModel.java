package com.example.test_project.Model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="utente")
public class utenteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idutente;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private String ruolo;
	private String utentecol;

	@OneToMany(mappedBy = "utente")
	private List<alloggioModel> alloggi;

	@OneToMany(mappedBy = "utente")
	private List<prenotazioneModel> prenotazioni;
	
	public utenteModel() {
		
	}

	public long getIdutente() {
		return idutente;
	}

	public void setIdutente(long idutente) {
		this.idutente = idutente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getUtentecol() {
		return utentecol;
	}

	public void setUtentecol(String utentecol) {
		this.utentecol = utentecol;
	}
	
	
}
