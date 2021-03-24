package com.mbodjiousseynou.NotesEtudiant.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Transient;

import com.mbodjiousseynou.NotesEtudiant.model.Etudiant;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numeroEtudiant")
	private Long id;
	private String nomMatier;
	private double note;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomMatier() {
		return nomMatier;
	}
	public void setNomMatier(String nomMatier) {
		this.nomMatier = nomMatier;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(Long id, String nomMatier, double note) {
		super();
		this.id = id;
		this.nomMatier = nomMatier;
		this.note = note;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", nomMatier=" + nomMatier + ", note=" + note + "]";
	}
	
	
	/*private Long etudiantID;
	@Transient
	private Etudiant etudiant;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomMatier() {
		return nomMatier;
	}
	public void setNomMatier(String nomMatier) {
		this.nomMatier = nomMatier;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public long getEtudiantID() {
		return etudiantID;
	}
	public void setEtudiantID(Long etudiantID) {
		this.etudiantID = etudiantID;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(Long id, String nomMatier, double note, Long etudiantID) {
		super();
		this.id = id;
		this.nomMatier = nomMatier;
		this.note = note;
		this.etudiantID = etudiantID;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", nomMatier=" + nomMatier + ", note=" + note + ", etudiantID=" + etudiantID + "]";
	}*/
	
	


}
