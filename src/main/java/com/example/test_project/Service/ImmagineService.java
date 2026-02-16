package com.example.test_project.Service;

import com.example.test_project.DTO.ImmagineDTO;
import com.example.test_project.Model.immagineModel;
import com.example.test_project.Repository.immagineRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImmagineService {
    
    @Autowired
    private immagineRepo immagineRepository;
    
    
    // Ottieni solo la prima immagine di un alloggio (per la card)
    public ImmagineDTO getPrimaImmagineByAlloggioId(Long idAlloggio) {
        immagineModel immagine = immagineRepository.findFirstByAlloggioId(idAlloggio);
        
        if (immagine != null) {
            return convertToDTO(immagine);
        }
        return null;
    }
    
    // Converti immagineModel in ImmagineDTO
    private ImmagineDTO convertToDTO(immagineModel immagine) {
        ImmagineDTO dto = new ImmagineDTO();
        dto.setIdimmagine(immagine.getIdImmagine());
        dto.setNomefile(immagine.getNomefile());
        
        // Estrai l'ID dall'alloggio (che è un oggetto nel tuo model)
        if (immagine.getAlloggio() != null) {
            dto.setIdAlloggio(immagine.getAlloggio().getIdAlloggio());
        }
        
        // Converti il BLOB in Base64 per Angular
        if (immagine.getContenuto() != null && immagine.getContenuto().length > 0) {
            String base64 = Base64.getEncoder().encodeToString(immagine.getContenuto());
            dto.setContenutoBase64("data:image/jpeg;base64," + base64);
        }
        
        return dto;
    }
}