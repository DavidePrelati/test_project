// davideprelati/test_project/.../java/com/example/test_project/Repository/utenteRepo.java
package com.example.test_project.Repository;

import java.util.Optional; // Aggiungi questo import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.test_project.Model.utenteModel;

@Repository
public interface utenteRepo extends JpaRepository<utenteModel, Long> {
    // Metodo per cercare l'utente tramite email
    Optional<utenteModel> findByEmail(String email);
}