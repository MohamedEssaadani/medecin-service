package org.essaadani.medecinservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedecinRequestDTO {
    private String id;
    private String nom;
    private Date dateNaissance;
    private String specialite;
}
