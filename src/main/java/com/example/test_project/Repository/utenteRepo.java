package com.example.test_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_project.Controller.utenteController;

@Repository
public interface utenteRepo extends JpaRepository<utenteController, Long>{

}
