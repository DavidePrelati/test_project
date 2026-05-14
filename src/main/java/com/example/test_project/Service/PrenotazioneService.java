package com.example.test_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test_project.DTO.PrenotazioneDTO;
import com.example.test_project.Model.prenotazioneModel;
import com.example.test_project.Repository.prenotazioneRepo;


@Service
public class PrenotazioneService {

    @Autowired
    public prenotazioneRepo prenotazioniRepo;
   

        public void save(prenotazioneModel prenotazione) {
            // repository.save è un metodo predefinito di Spring Data JPA
            prenotazioniRepo.save(prenotazione);
        }
    }

