package org.essaadani.medecinservice.service;

import org.essaadani.medecinservice.dto.MedecinRequestDTO;
import org.essaadani.medecinservice.dto.MedecinResponseDTO;
import org.essaadani.medecinservice.entities.Medecin;
import org.essaadani.medecinservice.mappers.MedecinMapper;
import org.essaadani.medecinservice.repositories.MedecinRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MedecinServiceImpl implements MedecinService {
    MedecinRepository medecinRepository;
    MedecinMapper medecinMapper;

    public MedecinServiceImpl(MedecinRepository medecinRepository, MedecinMapper medecinMapper) {
        this.medecinRepository = medecinRepository;
        this.medecinMapper = medecinMapper;
    }


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
        return null;
    }

    @Override
    public MedecinResponseDTO save(MedecinRequestDTO medecinRequestDTO) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
