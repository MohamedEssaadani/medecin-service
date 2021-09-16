package org.essaadani.medecinservice.repositories;

import org.essaadani.medecinservice.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, String> {
}
