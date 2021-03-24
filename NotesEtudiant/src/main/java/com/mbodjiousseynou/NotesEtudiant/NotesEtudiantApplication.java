package com.mbodjiousseynou.NotesEtudiant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.mbodjiousseynou.NotesEtudiant.entities.Note;
import com.mbodjiousseynou.NotesEtudiant.feign.EtudiantRestClient;
import com.mbodjiousseynou.NotesEtudiant.model.Etudiant;
import com.mbodjiousseynou.NotesEtudiant.repository.NotesEtudiantRepository;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class NotesEtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesEtudiantApplication.class, args);
	}
	@Bean
	CommandLineRunner start(NotesEtudiantRepository notesEtudiantRepository) {
		return args->{
			
			//notesEtudiantRepository.save(new Note(null,"algo",15));
			//notesEtudiantRepository.save(new Note(null,"histoire",18));
			notesEtudiantRepository.save(new Note(null,"anglais",12.0));
			notesEtudiantRepository.save(new Note(null,"math",15.0));
			
			notesEtudiantRepository.findAll().forEach(n->{
				System.out.println(n.toString());
			});
		};		
	}
}
