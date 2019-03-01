package eu.fr.indyli.formation.cdi.business.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import eu.fr.indyli.formation.cdi.business.entity.Tache;

@Named("tacheAFaireDAOBean")
public class TacheAFaireDAOImpl extends TacheDAOImpl{
	
	public List<Tache> listTacheAFaire;

	public TacheAFaireDAOImpl() {
		super();
		listTacheAFaire = new ArrayList<Tache>();
	}
	
	public List<Tache> findAll() {
		List<Tache> tacheListe = super.findAll();
		for (Tache tache : tacheListe) {
			if (tache.getStatut().equals(1)) {
				listTacheAFaire.add(tache);
			}
		}
		return listTacheAFaire;
	}
	}