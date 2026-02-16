package com.example.test_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_project.Controller.utenteController;
import com.example.test_project.Model.utenteModel;

@Repository
public interface utenteRepo extends JpaRepository<utenteModel, Long>{

}
