package com.example.test_project.DTO;

import java.util.List;

public class UtenteDTO {

    private long idutente;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String ruolo;

    private List<AlloggioDTO> alloggi;
    private List<PrenotazioneDTO> prenotazioni;
    private List<RecensioneDettaglioDTO> recensioni;

    public UtenteDTO(){

    }

    public long getIdutente (){
        return idutente;
    }

    public void setIdutente(long idutente){
        this.idutente = idutente;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail( String email){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getRuolo(){
        return ruolo;
    }

    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }

    public List<AlloggioDTO> getAlloggiList(){
        return alloggi;
    }

    public void setAlloggiList(List<AlloggioDTO> alloggi){
        this.alloggi = alloggi;
    }

    public List<PrenotazioneDTO> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(List<PrenotazioneDTO> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
    
    public List<RecensioneDettaglioDTO> getRecensioni() {
		return recensioni;
	}

	public void setRecensioni(List<RecensioneDettaglioDTO> recensioni) {
		this.recensioni = recensioni;
	}
    
}
