package com.wael.pays.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wael.pays.entities.Region;
import com.wael.pays.entities.pays;

@RepositoryRestResource(path = "rest")
public interface RegionRepository extends JpaRepository<Region,Long>{
	List<Region> findByNomRegion(String nom);
	List<Region> findByNomRegionContains(String nom);
	
	@Query("select p from Region p where p.nomRegion like %?1 and p.surface > ?2")
	List<Region> findBysurface (String nom, Double surface);
	
	@Query("select p from Region p where p.pays = ?1")
	List<Region> findBypays(pays pays);
	
	@Query("select p from Region p order by p.nomRegion ASC, p.surface DESC")
	List<Region> trierRegionsNomSurface ();
	
}
