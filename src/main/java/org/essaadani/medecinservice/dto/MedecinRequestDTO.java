package org.essaadani.medecinservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MedecinRequestDTO {
    private String nom;
    private Date dateNaissance;
    private String specialite;
}
