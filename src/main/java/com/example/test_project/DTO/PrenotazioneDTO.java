package com.example.test_project.DTO;

import java.time.LocalDate;
import java.util.List;

public class PrenotazioneDTO {

    private long idprenotazione;
    private LocalDate data_checkin;
    private LocalDate data_checkout;
    private int num_ospiti;
    private double prezzo;
    private int stato;

    private List<UtenteDTO> utenti;
    private List<AlloggioDettaglioDTO> alloggi;

    public PrenotazioneDTO(){

    }

    public long getIdprenotazione(){
        return idprenotazione;
    }

    public void setIdprenotazione(long idprenotazione){
        this.idprenotazione=idprenotazione;
    }

    public LocalDate getDataChekIn(){
        return data_checkin;
    }

    public void setDataCheckIn(LocalDate data_checkin){
        this.data_checkin=data_checkin;
    }

    public LocalDate getDataChekout(){
        return data_checkout;
    }

    public void setDataCheckOut(LocalDate data_checkout){
        this.data_checkout=data_checkout;
    }

    public int getNumOspiti(){
        return num_ospiti;
    }

    public void setNumOspiti( int num_ospiti){
        this.num_ospiti = num_ospiti;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }

    public int getStato(){
        return stato;
    }
    
    public void setStato(int stato){
        this.stato=stato;
    }

    public List<UtenteDTO> getUtentiList(){
        return utenti;
    }

    public void setUtentiList(List<UtenteDTO> utenti){
        this.utenti=utenti;
    }

    public List<AlloggioDettaglioDTO> getAlloggiList(){
        return alloggi;
    }

    public void setAlloggiList(List<AlloggioDettaglioDTO> alloggi){
        this.alloggi= alloggi;
    }
}
