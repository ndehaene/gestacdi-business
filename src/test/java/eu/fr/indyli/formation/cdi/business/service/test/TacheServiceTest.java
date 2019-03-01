package eu.fr.indyli.formation.cdi.business.service.test;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import eu.fr.indyli.formation.cdi.business.annotation.StatutTacheType;
import eu.fr.indyli.formation.cdi.business.entity.Tache;
import eu.fr.indyli.formation.cdi.business.service.ITacheService;
import eu.fr.indyli.formation.cdi.business.util.StatutTacheEnum;
import eu.fr.indyli.formation.cdi.business.util.WeldJUnit4Runner;

@RunWith(WeldJUnit4Runner.class)
public class TacheServiceTest {

	@Inject
	@StatutTacheType(StatutTacheEnum.TOUT)
	private ITacheService tacheService = null;
	
	@Inject
	@StatutTacheType(StatutTacheEnum.FINI)
	private ITacheService tacheServiceFini = null;
	
	@Inject
	@StatutTacheType(StatutTacheEnum.A_FAIRE)
	private ITacheService tacheServiceAFaire = null;



	@Test
	public void testFindAll() {
		List<Tache> tacheList = this.tacheService.findAll();
		Assert.assertTrue(tacheList.size() >0);
		for (Tache tache : tacheList) {
			System.out.println(tache);
		}
	}
	
	@Test
	public void testFindTacheFINIEAll() {
		List<Tache> tacheList = this.tacheServiceFini.findAll();
		Assert.assertTrue(tacheList.size() >0);
		for (Tache tache : tacheList) {
			System.out.println(tache);
	}}
	
	@Test
	public void testFindTacheAFaire() {
		List<Tache> tacheList = this.tacheServiceAFaire.findAll();
		Assert.assertTrue(tacheList.size() >0);
		for (Tache tache : tacheList) {
			System.out.println(tache);
	}
}
}
