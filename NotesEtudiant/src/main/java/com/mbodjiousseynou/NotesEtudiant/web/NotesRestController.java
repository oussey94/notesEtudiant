package com.mbodjiousseynou.NotesEtudiant.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mbodjiousseynou.NotesEtudiant.entities.Note;
import com.mbodjiousseynou.NotesEtudiant.feign.EtudiantRestClient;
import com.mbodjiousseynou.NotesEtudiant.model.Etudiant;
import com.mbodjiousseynou.NotesEtudiant.repository.NotesEtudiantRepository;

//@RestController
public class NotesRestController {
	
	private NotesEtudiantRepository notesEtudiantRepository;
	public NotesRestController(NotesEtudiantRepository notesEtudiantRepository, EtudiantRestClient etudiantRestClient) {
		super();
		this.notesEtudiantRepository = notesEtudiantRepository;
		this.etudiantRestClient = etudiantRestClient;
	}

	private EtudiantRestClient etudiantRestClient;
	
	@GetMapping(path = "/tous/{id}")
	public Note getNote(@PathVariable(name="id") Long id) {
		Note note=notesEtudiantRepository.findById(id).get();
		Etudiant etudiant=etudiantRestClient.getEtudiantById(note.getId());
		//note.setEtudiant(etudiant);
		return note;
		
	}

}
