package org.essaadani.medecinservice.service;

import org.essaadani.medecinservice.dto.MedecinRequestDTO;
import org.essaadani.medecinservice.dto.MedecinResponseDTO;

import java.util.List;

public interface MedecinService {
    List<MedecinResponseDTO> getAllMedecins();
    MedecinResponseDTO getMedecinById(String id);
    MedecinResponseDTO update(MedecinRequestDTO medecinRequestDTO);
    MedecinResponseDTO save(MedecinRequestDTO medecinRequestDTO);
    void delete(String id);

}
