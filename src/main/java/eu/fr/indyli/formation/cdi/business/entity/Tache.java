package eu.fr.indyli.formation.cdi.business.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;


/**
 * The persistent class for the Tache database table.
 * 
 */
public class Tache implements Serializable { 
	private static final long serialVersionUID = 1L;

	private Long idTache;
	private String libelleTache;
	private Integer statut;
	private Integer tempsRestant;
	private Integer tempsImparti;
	private Date dateCreation;
	
	public Tache() {
		this.dateCreation = new Date();
	}
	
	public Tache(Long idTache, String libelleTache, Integer statut, Integer tempsRestant, Integer tempsImparti) {
		super();
		this.idTache = idTache;
		this.libelleTache = libelleTache;
		this.statut = statut;
		this.tempsRestant = tempsRestant;
		this.tempsImparti = tempsImparti;
		this.dateCreation = new Date();
	}

	public Long getIdTache() {
		return this.idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public Date getDate() {
		return this.dateCreation;
	}

	public void setDate(Date date) {
		this.dateCreation = date;
	}

	
	public String getLibelleTache() {
		return libelleTache;
	}

	public void setLibelleTache(String libelleTache) {
		this.libelleTache = libelleTache;
	}

	public Integer getStatut() {
		return statut;
	}

	public void setStatut(Integer statut) {
		this.statut = statut;
	}

	public Integer getTempsRestant() {
		return tempsRestant;
	}

	public void setTempsRestant(Integer tempsRestant) {
		this.tempsRestant = tempsRestant;
	}

	public Integer getTempsImparti() {
		return tempsImparti;
	}

	public void setTempsImparti(Integer tempsImparti) {
		this.tempsImparti = tempsImparti;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}