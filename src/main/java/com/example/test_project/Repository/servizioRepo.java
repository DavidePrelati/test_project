package com.example.test_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_project.Model.servizioModel;

@Repository
public interface servizioRepo extends JpaRepository<servizioModel, Long> {

}
