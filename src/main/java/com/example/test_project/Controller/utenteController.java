// davideprelati/test_project/.../java/com/example/test_project/Controller/utenteController.java
package com.example.test_project.Controller;

import com.example.test_project.Model.utenteModel;
import com.example.test_project.Repository.utenteRepo;
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

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        // Cerca l'utente per email
        Optional<utenteModel> utenteOpt = repo.findByEmail(email);

        if (utenteOpt.isPresent()) {
            utenteModel utente = utenteOpt.get();
            
            // Verifica la password (in un progetto reale usa BCrypt!)
            if (utente.getPassword().equals(password)) {
                // Crea la risposta che si aspetta il frontend
                Map<String, Object> response = new HashMap<>();
                response.put("token", "dummy-jwt-token-" + utente.getIdutente());
                response.put("nome", utente.getNome());
                response.put("ruolo", utente.getRuolo());
                
                return ResponseEntity.ok(response);
            }
        }

        // Se le credenziali sono errate
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenziali errate");
    }
}