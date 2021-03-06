package eu.fr.indyli.formation.cdi.business.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import eu.fr.indyli.formation.cdi.business.annotation.StatutTacheType;
import eu.fr.indyli.formation.cdi.business.dao.ITacheDAO;
import eu.fr.indyli.formation.cdi.business.entity.Tache;
import eu.fr.indyli.formation.cdi.business.service.ITacheService;
import eu.fr.indyli.formation.cdi.business.util.StatutTacheEnum;

@StatutTacheType(StatutTacheEnum.FINI)
public class TacheFiniServiceImpl implements ITacheService{

	@Inject
	@Named("TacheFINIDAOBean")
	private ITacheDAO tacheDAO = null;
	
	public List<Tache> findAll() {
		List<Tache> listeFinie = tacheDAO.findAll();
		return listeFinie;
	}


}
