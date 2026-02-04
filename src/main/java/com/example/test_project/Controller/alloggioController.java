package com.example.test_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test_project.DTO.AlloggioDTO;
import com.example.test_project.Mapper.AlloggioMapper;
import com.example.test_project.Model.alloggioModel;
import com.example.test_project.Service.AlloggioService;

@RestController
@RequestMapping("/alloggi")
public class alloggioController {

    @Autowired
    private AlloggioService alloggioService;

    
    
}
