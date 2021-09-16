package org.essaadani.medecinservice;

import org.essaadani.medecinservice.dto.MedecinRequestDTO;
import org.essaadani.medecinservice.service.MedecinService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MedecinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedecinServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(MedecinService medecinService){
        return args -> {
          medecinService.save(new MedecinRequestDTO("Medecin1", new Date("18/01/1998"), "Généraliste"));
          medecinService.save(new MedecinRequestDTO("Medecin2", new Date("01/05/1990"), "Généraliste"));
          medecinService.save(new MedecinRequestDTO("Medecin3", new Date("18/04/1985"), "Dentiste"));
        };
    }
}
