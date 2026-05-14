package com.example.test_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test_project.DTO.PrenotazioneRequest;
import com.example.test_project.Model.alloggioModel;
import com.example.test_project.Model.prenotazioneModel;
import com.example.test_project.Model.utenteModel;
import com.example.test_project.Service.PrenotazioneService;

@RestController
@RequestMapping("/prenotazione")
@CrossOrigin(origins = "http://localhost:4200")
public class prenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService; // Useremo il service per salvare

    @Autowired
    private com.example.test_project.Repository.utenteRepo utenteRepo; // Ti servono i repo per cercare gli oggetti
    
    @Autowired
    private com.example.test_project.Repository.alloggioRepo alloggioRepo;

    @PostMapping
    public ResponseEntity<?> prenota(@RequestBody PrenotazioneRequest request) {
        try {
            // 1. Creiamo il modello da salvare
            prenotazioneModel model = new prenotazioneModel();
            model.setData_checkin(request.getData_checkin());
            model.setData_checkout(request.getData_checkout());
            model.setNum_ospiti(request.getNum_ospiti());
            model.setPrezzo(request.getPrezzo());
            model.setStato(request.getStato());

            // 2. Cerchiamo l'utente e l'alloggio nel DB usando gli ID mandati da Angular
            utenteModel utente = utenteRepo.findById(request.getIdutente())
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));
            
            alloggioModel alloggio = alloggioRepo.findById(request.getId_alloggio())
                .orElseThrow(() -> new RuntimeException("Alloggio non trovato"));

            // 3. Colleghiamo gli oggetti al modello
            model.setUtente(utente);
            model.setAlloggio(alloggio);

            // 4. Salviamo tramite il service
            prenotazioneService.save(model);

            return ResponseEntity.ok().body("{\"messaggio\": \"Prenotazione registrata con successo\"}");
        } catch (Exception e) {
            e.printStackTrace(); // Fondamentale per vedere l'errore reale nella console Java
            return ResponseEntity.status(500).body("Errore nel salvataggio: " + e.getMessage());
        }
    }
}