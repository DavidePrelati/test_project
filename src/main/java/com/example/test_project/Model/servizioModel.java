package com.example.test_project.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "servizio")
public class servizioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idservizio;
	
	private String nome;
	
	@OneToMany(mappedBy = "servizio")
	private List<alloggioServizioModel> alloserv;
	
	
	public servizioModel() {	
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


	public List<alloggioServizioModel> getAlloserv() {
		return alloserv;
	}


	public void setAlloserv(List<alloggioServizioModel> alloserv) {
		this.alloserv = alloserv;
	}
	
	
	
}
