package org.formacio.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "T_PERSONES")

@SequenceGenerator(name = "sequencia_persona", sequenceName = "SEQ_PERSONA")
public class Persona {

	/*
	 * Persona ha d'emprar la sequencia SEQ_PERSONA per els ids
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_persona")
	@Column(name = "PER_ID")
	private Long id;

	@Column(name = "PER_NOM")
	private String nom;

	private Set<Casa> propietats = new HashSet<>();

	private Set<Animal> mascotes = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Set<Casa> getPropietats() {
		return propietats;
	}
	public void setPropietats(Set<Casa> propietats) {
		this.propietats = propietats;
	}
	public Set<Animal> getMascotes() {
		return mascotes;
	}
	public void setMascotes(Set<Animal> mascotes) {
		this.mascotes = mascotes;
	}

	
}
