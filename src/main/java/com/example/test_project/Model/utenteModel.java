package com.example.test_project.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	public utenteModel(long idutente, String nome, String cognome, String email, String password, String ruolo,
			String utentecol) {
		this.idutente = idutente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.ruolo = ruolo;
		this.utentecol = utentecol;
	}
	
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
