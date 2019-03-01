package eu.fr.indyli.formation.cdi.business.dao;

import java.util.List;

import eu.fr.indyli.formation.cdi.business.entity.Tache;

public interface ITacheDAO {

	public List<Tache> findAll();
}
