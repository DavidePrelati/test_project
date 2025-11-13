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
}
