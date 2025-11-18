package com.example.test_project.Model;

import org.hibernate.annotations.ManyToAny;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="alloggio_servizio")
public class alloggioServizioModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="id_alloggio")
	private alloggioModel alloggio;
	
	@ManyToOne
	@JoinColumn(name="id_servizio")
	private servizioModel servizio;

	public alloggioServizioModel() {
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public alloggioModel getAlloggio() {
		return alloggio;
	}

	public void setAlloggio(alloggioModel alloggio) {
		this.alloggio = alloggio;
	}

	public servizioModel getServizio() {
		return servizio;
	}

	public void setServizio(servizioModel servizio) {
		this.servizio = servizio;
	}
	
}
