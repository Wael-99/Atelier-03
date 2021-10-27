package com.wael.pays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wael.pays.entities.Region;
import com.wael.pays.entities.pays;
import com.wael.pays.repos.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService  {

	
	@Autowired
	RegionRepository regionRepository;
	
	@Override
	public Region saveRegion(Region r) {
	return regionRepository.save(r);
	}
	
	@Override
	public Region updateRegion(Region r) {
	return regionRepository.save(r);
	}
	@Override
	public void deleteRegion(Region r) {
	regionRepository.delete(r);
	}
	@Override
	public void deleteRegionById(Long id) {
	regionRepository.deleteById(id);
	}
	@Override
	public Region getRegion(Long id) {
	return regionRepository.findById(id).get();
	}
	@Override
	public List<Region> getAllRegions() {
	return regionRepository.findAll();
	}
	
	@Override
	public List<Region> findBypays(pays pays) {
	return regionRepository.findBypays(pays);
	}
	
	
	@Override
	public List<Region> trierRegionsNomSurface() {
	return regionRepository.trierRegionsNomSurface();
	}

	@Override
	public List<Region> findBysurface(String nom, Double surface) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Region> findByOrderByNomRegionAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Region> findBypays(Long idPays) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
