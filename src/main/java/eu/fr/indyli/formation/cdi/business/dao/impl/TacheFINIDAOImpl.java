package eu.fr.indyli.formation.cdi.business.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import eu.fr.indyli.formation.cdi.business.entity.Tache;

@Named("TacheFINIDAOBean")
public class TacheFINIDAOImpl extends TacheDAOImpl{
	
	public List<Tache> listTacheFinies;

	public TacheFINIDAOImpl() {
		super();
		listTacheFinies = new ArrayList<Tache>();
	}
	
	public List<Tache> findAll() {
		List<Tache> tacheListe = super.findAll();
		for (Tache tache : tacheListe) {
			if (tache.getStatut().equals(3)) {
				listTacheFinies.add(tache);
			}
		}
		return listTacheFinies;
	}
	
	}

