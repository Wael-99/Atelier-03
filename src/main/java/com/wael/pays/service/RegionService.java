package com.wael.pays.service;

import java.util.List;

import com.wael.pays.entities.Region;
import com.wael.pays.entities.pays;

public interface RegionService {

	Region saveRegion(Region r);
	Region updateRegion(Region r);
	void deleteRegion(Region r);
	void deleteRegionById(Long id);
	Region getRegion(Long id);
	List<Region> getAllRegions();
	List<Region> findBysurface (String nom, Double surface);
	List<Region> findByOrderByNomRegionAsc();
	List<Region> trierRegionsNomSurface();
	List<Region> findBypays(Long idPays);
	List<Region> findBypays(pays pays);
}
