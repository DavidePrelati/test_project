package com.example.test_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.test_project.DTO.AlloggioDTO;
import com.example.test_project.DTO.AlloggioDettaglioDTO;
import com.example.test_project.Mapper.AlloggioMapper;
import com.example.test_project.Model.alloggioModel;
import com.example.test_project.Service.AlloggioService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/alloggi")
public class alloggioController {

    private final AlloggioService alloggioService;
    
    public alloggioController(AlloggioService alloggioService) {
    	this.alloggioService = alloggioService;
    }

    @GetMapping
    public ResponseEntity<List<AlloggioDTO>> getAlloggi() {
        return ResponseEntity.ok(alloggioService.getAlloggi());
    }

    @GetMapping("/{id}")
    public AlloggioDettaglioDTO getAlloggio(@PathVariable("id") Long idalloggio) {
        return alloggioService.getAlloggioDett(idalloggio);
    }

    
    
}
