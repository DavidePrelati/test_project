package com.example.test_project.DTO;

public class ImmagineDTO {
    private Long idimmagine;
    private String nomefile;
    private Long idalloggio;  // Solo l'ID, non l'oggetto completo
    private String contenutoBase64;  // Per Angular
    
    public ImmagineDTO() {}
    
    // Getters e Setters
    public Long getIdimmagine() {
        return idimmagine;
    }
    
    public void setIdimmagine(Long idimmagine) {
        this.idimmagine = idimmagine;
    }
    
    public String getNomefile() {
        return nomefile;
    }
    
    public void setNomefile(String nomefile) {
        this.nomefile = nomefile;
    }
    
    public Long getIdAlloggio() {
        return idalloggio;
    }
    
    public void setIdAlloggio(Long idalloggio) {
        this.idalloggio = idalloggio;
    }
    
    public String getContenutoBase64() {
        return contenutoBase64;
    }
    
    public void setContenutoBase64(String contenutoBase64) {
        this.contenutoBase64 = contenutoBase64;
    }
}