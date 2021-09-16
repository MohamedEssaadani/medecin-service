package org.essaadani.medecinservice.mappers;

import org.essaadani.medecinservice.dto.MedecinRequestDTO;
import org.essaadani.medecinservice.dto.MedecinResponseDTO;
import org.essaadani.medecinservice.entities.Medecin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedecinMapper {
    MedecinResponseDTO medecinToMedecinResponseDTO(Medecin medecin);
    Medecin medecinRequestDTOToMedecin(MedecinRequestDTO medecinRequestDTO);
}
