package org.formacio.domain;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "t_persones")

@SequenceGenerator(name = "sequencia_persona", sequenceName = "seq_persona")
public class Persona {

	/*
	 * Persona ha d'emprar la sequencia SEQ_PERSONA per els ids
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_persona")
	@Column(name = "per_id")
	private Long id;

	@Column(name = "per_nom")
	private String nom;

/*	@OneToMany(mappedBy = "adreca", fetch = FetchType.EAGER)
	private Set<Casa> propietats = new HashSet<>();*/

	@OneToMany(mappedBy = "nom", fetch = FetchType.EAGER)
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
/*	public Set<Casa> getPropietats() {
		return propietats;
	}
	public void setPropietats(Set<Casa> propietats) {
		this.propietats = propietats;
	}*/
	public Set<Animal> getMascotes() {
		return mascotes;
	}
	public void setMascotes(Set<Animal> mascotes) {
		this.mascotes = mascotes;
	}

	
}
