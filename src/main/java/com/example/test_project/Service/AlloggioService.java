package com.example.test_project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test_project.Model.alloggioModel;
import com.example.test_project.Repository.alloggioRepo;

import jakarta.persistence.EntityNotFoundException;

public class AlloggioService {
	
	@Autowired
	private alloggioRepo allogRepo;
	
	//---------All--------------
	public List<alloggioModel> findAllAlloggi(){
		return allogRepo.findAll();
	}
	
	//------ById-----------------------
	public alloggioModel findById(Long id) {
	    if (id == null) {
	        throw new IllegalArgumentException("L'id non può essere null");
	    }

	    return allogRepo.findById(id)
	        .orElseThrow(() ->
	            new EntityNotFoundException("Alloggio con id " + id + " non trovato")
	        );
	}
	
	//-------ByTitolo-----------------------------
	public List<alloggioModel> findByTitolo(String titolo) {
	    if (titolo == null) {
	        throw new IllegalArgumentException("Il titolo non può essere null");
	    }

	    List<alloggioModel> risultati = allogRepo.findByTitoloStartingWith(titolo);

	    if (risultati.isEmpty()) {
	        throw new EntityNotFoundException(
	            "Nessun alloggio trovato con titolo: " + titolo
	        );
	    }

	    return risultati;
	}
	
	//-------ByDescri-----------------
	public List<alloggioModel> findByDescrizione(String descrizione){
		if (descrizione == null) {
			throw new IllegalArgumentException("La descrizione non può essere null");
		}
		
		List<alloggioModel> risultati = allogRepo.findByDescrizioneStartingWith(descrizione);
		
		if (risultati.isEmpty()) {
			throw new EntityNotFoundException("Nessun alloggio trovato con descrizione: " + descrizione);
		}
		
		return risultati;	
	}
	
	//--------ByIndirizzo------------
	public alloggioModel findByIndirizzo(String indirizzo) {
		if (indirizzo == null) {
			throw new IllegalArgumentException("L'indirizzo non può essere null");
		}
		alloggioModel risultato = allogRepo.findByIndirizzoStartingWith(indirizzo);
		
		if (risultato == null) {
			throw new EntityNotFoundException("Nessun alloggio trovato con indirizzo " + indirizzo);
		}
		
		return risultato;
	}
	
	//------ByCitta--------------------
	public List<alloggioModel> findByCitta(String citta){
		
		if(citta == null) {
			throw new IllegalArgumentException("La città non può essere null");
		}
		List<alloggioModel> risultati = allogRepo.findByCittaStartingWith(citta);
		if (risultati.isEmpty()) {
			throw new EntityNotFoundException("Nessun alloggio trovato nella città " + citta);
		}
		
		return risultati;
	}
	
	
	//-----ByCAP---------------
	public List<alloggioModel> findByCap(int cap){
		if(cap == 0) {
			throw new IllegalArgumentException("Il CAP non può essere null");
		}
		List<alloggioModel> risultati = allogRepo.findByCap(cap);
		if(risultati.isEmpty()) {
			throw new EntityNotFoundException("Nessun alloggio trovato nel CAP " + cap);
		}
		
		return risultati;
	}
	
	
	//---------ByCountry-----------
	public List<alloggioModel> findByPaese(String paese){
		if(paese == null) {
			throw new IllegalArgumentException("Il paese non può essere null");
		}
		List<alloggioModel> risultati = allogRepo.findByPaeseStartingWith(paese);
		if( risultati.isEmpty()) {
			throw new EntityNotFoundException("Nessun alloggio trovato nel paese " +  paese);
		}
		return risultati;
	}

}
