package com.example.test_project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_project.Model.alloggioModel;

@Repository
public interface alloggioRepo extends JpaRepository<alloggioModel, Long> {
	
	 List<alloggioModel> findByTitoloStartingWith (String titolo);
	 
	 List<alloggioModel> findByDescrizioneStartingWith (String descrizione);

	 alloggioModel findByIndirizzoStartingWith (String indirizzo);
	 
	 List<alloggioModel> findByCittaStartingWith (String citta);
	 
	 List<alloggioModel> findByCap (int cap);
	 
	 List<alloggioModel> findByPaeseStartingWith (String paese);
}
