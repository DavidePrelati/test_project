package com.example.test_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test_project.Model.utenteModel;
import com.example.test_project.Repository.utenteRepo;

@Service
public class UtenteService {
	
	@Autowired
	public utenteRepo utenteRepo;
	
	 public void register (utenteModel utente) {
	        utenteRepo.save(utente);
	    }

}
