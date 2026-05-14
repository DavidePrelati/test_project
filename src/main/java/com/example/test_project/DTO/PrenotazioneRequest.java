package com.example.test_project.DTO;

import java.time.LocalDate;

public class PrenotazioneRequest {
    private LocalDate data_checkin;
    private LocalDate data_checkout;
    private int num_ospiti;
    private double prezzo;
    private int stato;
    private long id_alloggio;
    private long idutente;

    // Getter e Setter per tutti i campi
    public LocalDate getData_checkin() { return data_checkin; }
    public void setData_checkin(LocalDate data_checkin) { this.data_checkin = data_checkin; }
    
    public LocalDate getData_checkout() { return data_checkout; }
    public void setData_checkout(LocalDate data_checkout) { this.data_checkout = data_checkout; }
    
    public int getNum_ospiti() { return num_ospiti; }
    public void setNum_ospiti(int num_ospiti) { this.num_ospiti = num_ospiti; }
    
    public double getPrezzo() { return prezzo; }
    public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
    
    public int getStato() { return stato; }
    public void setStato(int stato) { this.stato = stato; }
    
    public long getId_alloggio() { return id_alloggio; }
    public void setId_alloggio(long id_alloggio) { this.id_alloggio = id_alloggio; }
    
    public long getIdutente() { return idutente; }
    public void setIdutente(long idutente) { this.idutente = idutente; }
}