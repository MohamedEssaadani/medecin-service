package org.essaadani.medecinservice.web;

import lombok.RequiredArgsConstructor;
import org.apache.http.protocol.HTTP;
import org.essaadani.medecinservice.dto.MedecinRequestDTO;
import org.essaadani.medecinservice.dto.MedecinResponseDTO;
import org.essaadani.medecinservice.entities.Medecin;
import org.essaadani.medecinservice.service.MedecinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

@RequiredArgsConstructor
public class MedecinRestController {
    private final MedecinService medecinService;


    @GetMapping("/medecins")
    public ResponseEntity<List<MedecinResponseDTO>> getMedecins(){
        try{
            List<MedecinResponseDTO> medecins = medecinService.getAllMedecins();

            return new ResponseEntity<>(medecins, HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/medecins/{id}")
    public ResponseEntity<MedecinResponseDTO> getMedecin(@PathVariable String id){
        try{
            MedecinResponseDTO medecin = medecinService.getMedecinById(id);

            return new ResponseEntity<>(medecin, HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/medecins")
    public ResponseEntity<MedecinResponseDTO> saveMedecin(@RequestBody MedecinRequestDTO medecinRequestDTO){
        try{
            MedecinResponseDTO createdMedecin = medecinService.save(medecinRequestDTO);

            return new ResponseEntity<>(createdMedecin, HttpStatus.CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/medecins")
    public ResponseEntity<MedecinResponseDTO> updateMedecin(@RequestBody MedecinRequestDTO medecinRequestDTO){
        try{
            MedecinResponseDTO updatedMedecin = medecinService.update(medecinRequestDTO);

            return new ResponseEntity<>(updatedMedecin, HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
