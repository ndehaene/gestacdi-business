package eu.fr.indyli.formation.cdi.business.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import eu.fr.indyli.formation.cdi.business.annotation.StatutTacheType;
import eu.fr.indyli.formation.cdi.business.dao.ITacheDAO;
import eu.fr.indyli.formation.cdi.business.entity.Tache;
import eu.fr.indyli.formation.cdi.business.service.ITacheService;
import eu.fr.indyli.formation.cdi.business.util.StatutTacheEnum;

@StatutTacheType(StatutTacheEnum.TOUT)
public class TacheServiceImpl implements ITacheService{

	@Inject
	@Named("tacheDAOBean")
	private ITacheDAO tacheDAO = null;
	
	public List<Tache> findAll() {
		return tacheDAO.findAll();
	}

}
