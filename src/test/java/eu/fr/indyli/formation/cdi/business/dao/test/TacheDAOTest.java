package eu.fr.indyli.formation.cdi.business.dao.test;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import eu.fr.indyli.formation.cdi.business.dao.ITacheDAO;
import eu.fr.indyli.formation.cdi.business.entity.Tache;
import eu.fr.indyli.formation.cdi.business.util.WeldJUnit4Runner;

@RunWith(WeldJUnit4Runner.class)
public class TacheDAOTest {

	@Inject 
	@Named("tacheDAOBean")
	private ITacheDAO tacheDAO = null;
	
	@Inject 
	@Named("tacheAFaireDAOBean")
	private ITacheDAO tacheDAOToDo = null;
	
	@Inject 
	@Named("TacheFINIDAOBean")
	private ITacheDAO tacheDAOFini = null;
	
	@Test
	public void testGetAllTache() {
		List<Tache> tacheList = this.tacheDAO.findAll();
		Assert.assertTrue(tacheList.size() >0);
		for (Tache tache : tacheList) {
			System.out.println(tache);}
		}
		
	@Test
	public void testGetTacheFini() {
		List<Tache> tacheList = this.tacheDAOFini.findAll();
		Assert.assertTrue(tacheList.size() >0);
		for (Tache tache : tacheList) {
			System.out.println(tache);}
		}
		
	@Test
	public void testGetTacheToDo() {
		List<Tache> tacheList = this.tacheDAOToDo.findAll();
		Assert.assertTrue(tacheList.size() >0);
		for (Tache tache : tacheList) {
			System.out.println(tache);
		}
	}
}
