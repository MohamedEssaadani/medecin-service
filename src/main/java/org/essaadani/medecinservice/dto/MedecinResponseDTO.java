package org.essaadani.medecinservice.dto;

import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class MedecinResponseDTO {
    private String id;
    private String nom;
    private Date dateNaissance;
    private String specialite;
}
