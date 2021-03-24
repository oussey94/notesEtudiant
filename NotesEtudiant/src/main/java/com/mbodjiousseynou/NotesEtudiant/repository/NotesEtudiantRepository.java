package com.mbodjiousseynou.NotesEtudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mbodjiousseynou.NotesEtudiant.entities.Note;
@RepositoryRestResource
public interface NotesEtudiantRepository extends JpaRepository<Note, Long> {

}
