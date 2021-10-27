package com.wael.pays;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wael.pays.entities.pays;
import com.wael.pays.entities.Region;
import com.wael.pays.repos.RegionRepository;

@SpringBootTest
class PaysApplicationTests {

	@Autowired
	private RegionRepository regionRepository;
	/*
	@Test
	public void TestCreateRegion () {
		Pays p = new Pays();
		p.setIdPays(1L);
		Region reg = new Region(null,"Nabeul",60.7,p);
		regionRepository.save(reg);
	}

	@Test
	public void testFindRegion()
	{
	Region r = regionRepository.findById(1L).get();

	System.out.println(r);
	}
	
	@Test
	public void testUpdateRegion()
	{
	Region r = regionRepository.findById(2L).get();
	r.setNomRegion("valide");
	regionRepository.save(r);
	}
	
	@Test
	public void testDeleteRegion()
	{
	regionRepository.deleteById(2L);;
	}
	
	@Test
	public void testListerTousRegions()
	{
	List<Region> prods = regionRepository.findAll();
	for (Region p : prods)
	{
	System.out.println(p);
	}
	}
	*/
	
	@Test
	public void testFindByNomRegion()
	{
	List<Region> reg = regionRepository.findByNomRegion("Nabeul");

	for (Region r : reg)
	{
	System.out.println(r);
	}

	}
	
	@Test
	public void testFindByNomRegionContains ()
	{
	List<Region> reg=regionRepository.findByNomRegionContains("Nab");

	for (Region r : reg)
	{
	System.out.println(r);
	} 
	}
	
	@Test
	public void testfindBySurface()
	{
	List<Region> reg = regionRepository.findBysurface("Nabeul",60.7 );
	for (Region r : reg)
	{
	System.out.println(r);
	}

	}
	
	@Test
	public void testfindBypays()
	{
	pays pays = new pays();
	pays.setIdPays(1L);
	List<Region> pay = regionRepository.findBypays(pays);
	for (Region r : pay)
	{
	System.out.println(r);
	}

	}
	
	@Test
	public void testtrierRegionsNomSurface()
	{
	List<Region> prods = regionRepository.trierRegionsNomSurface();
	for (Region p : prods)
	{
	System.out.println(p);
	}

	}
	
}
