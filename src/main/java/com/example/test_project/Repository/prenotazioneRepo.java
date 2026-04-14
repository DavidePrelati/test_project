package com.example.test_project.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_project.Model.alloggioModel;
import com.example.test_project.Model.prenotazioneModel;
import com.example.test_project.Model.utenteModel;


@Repository
public interface prenotazioneRepo extends JpaRepository<prenotazioneModel, Long> {

    List<prenotazioneModel> findByData_checkin(LocalDate data_checkin); 

    List<prenotazioneModel> findByData_checkout(LocalDate data_checkout);

    List<prenotazioneModel> findByUtente(utenteModel utente);

    List<prenotazioneModel> findByAlloggio(alloggioModel alloggio);

    List<prenotazioneModel> findByStato(int stato);
}
