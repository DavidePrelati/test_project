package com.example.test_project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.test_project.Model.immagineModel;

@Repository
public interface immagineRepo extends JpaRepository<immagineModel, Long> {
	
	

	 @Query("SELECT i FROM immagineModel i WHERE i.alloggio.idalloggio = :idAlloggio ORDER BY i.idimmagine ASC LIMIT 1")
	    immagineModel findFirstByAlloggioId(@Param("idalloggio") Long idalloggio);
	 
}
