package com.example.test_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_project.Model.alloggioServizioModel;

@Repository
public interface alloggioServizioRepo extends JpaRepository<alloggioServizioModel, Long>{

}
