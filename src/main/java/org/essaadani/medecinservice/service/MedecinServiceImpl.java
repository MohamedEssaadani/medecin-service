package org.essaadani.medecinservice.service;

import lombok.RequiredArgsConstructor;
import org.essaadani.medecinservice.dto.MedecinRequestDTO;
import org.essaadani.medecinservice.dto.MedecinResponseDTO;
import org.essaadani.medecinservice.entities.Medecin;
import org.essaadani.medecinservice.mappers.MedecinMapper;
import org.essaadani.medecinservice.repositories.MedecinRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class MedecinServiceImpl implements MedecinService {
    private final MedecinRepository medecinRepository;
    private final MedecinMapper medecinMapper;


    @Override
    public List<MedecinResponseDTO> getAllMedecins() {
        List<Medecin> medecins = medecinRepository.findAll();

        return  medecins.stream()
                .map(medecin -> medecinMapper.medecinToMedecinResponseDTO(medecin))
                .collect(Collectors.toList());
    }

    @Override
    public MedecinResponseDTO getMedecinById(String id) {
        Medecin medecin = medecinRepository.findById(id).get();

        return medecinMapper.medecinToMedecinResponseDTO(medecin);
    }

    @Override
    public MedecinResponseDTO update(MedecinRequestDTO medecinRequestDTO) {
        Medecin medecin = medecinMapper.medecinRequestDTOToMedecin(medecinRequestDTO);
        Medecin updatedMedecin = medecinRepository.save(medecin);

        return medecinMapper.medecinToMedecinResponseDTO(updatedMedecin);
    }

    @Override
    public MedecinResponseDTO save(MedecinRequestDTO medecinRequestDTO) {
        Medecin medecin = medecinMapper.medecinRequestDTOToMedecin(medecinRequestDTO);
        medecin.setId(UUID.randomUUID().toString());
        Medecin createdMedecin = medecinRepository.save(medecin);

        return medecinMapper.medecinToMedecinResponseDTO(createdMedecin);
    }

    @Override
    public void delete(String id) {
        medecinRepository.deleteById(id);
    }
}
