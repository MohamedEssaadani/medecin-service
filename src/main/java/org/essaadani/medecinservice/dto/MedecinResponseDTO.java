package org.essaadani.medecinservice.dto;

import lombok.Data;
import java.util.Date;

@Data
public class MedecinResponseDTO {
    private String id;
    private String nom;
    private Date dateNaissance;
    private String specialite;
}
