package eu.fr.indyli.formation.cdi.business.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import eu.fr.indyli.formation.cdi.business.dao.ITacheDAO;
import eu.fr.indyli.formation.cdi.business.entity.Tache;
import eu.fr.indyli.formation.cdi.business.util.StatutTacheEnum;


@Named("tacheDAOBean")
public class TacheDAOImpl implements ITacheDAO{

	public List<Tache> databaseTacheList;
	
	public TacheDAOImpl() {
		this.databaseTacheList = new ArrayList<Tache>();
		//Integer idTache, String libelleTache, Integer statut, Integer tempsRestant, Integer tempsImparti
		Tache t1 = new Tache(System.currentTimeMillis(),"Spec fonctionnel",StatutTacheEnum.EN_COURS.getStatutTache(),30,60);
		Tache t2 = new Tache(System.currentTimeMillis(),"Spec technique",StatutTacheEnum.A_FAIRE.getStatutTache(),60,60);
		Tache t3 = new Tache(System.currentTimeMillis(),"Mise en place des ENV",StatutTacheEnum.A_FAIRE.getStatutTache(),10,10);
		Tache t4 = new Tache(System.currentTimeMillis(),"Mont�e en comp�tence technique",StatutTacheEnum.FINI.getStatutTache(),0,5);
		Tache t5 = new Tache(System.currentTimeMillis(),"Mont�e en comp�tence fonctionnelle",StatutTacheEnum.FINI.getStatutTache(),0,6);
		Tache t6 = new Tache(System.currentTimeMillis(),"Connexion App",StatutTacheEnum.A_TESTER.getStatutTache(),2,4);
		Tache t7 = new Tache(System.currentTimeMillis(),"Affichage des taches",StatutTacheEnum.EN_COURS.getStatutTache(),1,2);
		Tache t8 = new Tache(System.currentTimeMillis(),"Affichage des utilisateurs",StatutTacheEnum.A_FAIRE.getStatutTache(),2,2);
		Tache t9 = new Tache(System.currentTimeMillis(),"Deconnexion",StatutTacheEnum.A_FAIRE.getStatutTache(),2,2);
		Tache t10 = new Tache(System.currentTimeMillis(),"Revue de code",StatutTacheEnum.A_FAIRE.getStatutTache(),3,3);
		this.databaseTacheList.add(t10);
		this.databaseTacheList.add(t9);
		this.databaseTacheList.add(t8);
		this.databaseTacheList.add(t7);
		this.databaseTacheList.add(t6);
		this.databaseTacheList.add(t5);
		this.databaseTacheList.add(t4);
		this.databaseTacheList.add(t3);
		this.databaseTacheList.add(t2);
		this.databaseTacheList.add(t1);
	}
	public List<Tache> findAll() {
		return this.databaseTacheList;
	}

}
