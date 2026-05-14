// davideprelati/test_project/.../java/com/example/test_project/Controller/utenteController.java
package com.example.test_project.Controller;

import com.example.test_project.Model.utenteModel;
import com.example.test_project.Repository.utenteRepo;
import com.example.test_project.Service.UtenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController // Usa @RestController per le API
@RequestMapping("/auth") // Corrisponde all'URL usato nel frontend
public class utenteController {

    @Autowired
    private utenteRepo repo;
    
    @Autowired
    private UtenteService utenteService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        Optional<utenteModel> utenteOpt = repo.findByEmail(email);

        if (utenteOpt.isPresent()) {
            utenteModel utente = utenteOpt.get();
            
            if (utente.getPassword().equals(password)) {
                Map<String, Object> response = new HashMap<>();
                
                // AGGIUNGI QUESTA RIGA: è il pezzo fondamentale che mancava!
                response.put("idutente", utente.getIdutente()); 
                
                response.put("token", "dummy-jwt-token-" + utente.getIdutente());
                response.put("nome", utente.getNome());
                response.put("ruolo", utente.getRuolo());
                
                return ResponseEntity.ok(response);
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenziali errate");
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody utenteModel utente) {
        utenteService.register(utente);
        return ResponseEntity.ok(Map.of(
        	    "message", "Utente registrato"
        	));
    }
}