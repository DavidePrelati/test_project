package com.example.test_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servizio")
public class servizioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idservizio;
	
	private String nome;
	
	public servizioModel() {	
	}
	
	public servizioModel(long idservizio, String nome) {
		this.idservizio = idservizio;
		this.nome = nome;
	}

	public long getIdservizio() {
		return idservizio;
	}
	
	public void setIdservizio(long idservizio) {
		this.idservizio = idservizio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
