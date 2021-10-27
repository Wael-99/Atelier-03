package com.wael.pays.restcontrollers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wael.pays.entities.Region;
import com.wael.pays.service.RegionService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RegionRESTController {
	
@Autowired

RegionService regionService;
@RequestMapping(method = RequestMethod.GET)
public List<Region> getAllRegions() {
return regionService.getAllRegions();
 }

@RequestMapping(method = RequestMethod.POST)
public Region createRegion(@RequestBody Region Region) {
return regionService.saveRegion(Region);
}

@RequestMapping(method = RequestMethod.PUT)
public Region updateRegion(@RequestBody Region Region) {
return regionService.updateRegion(Region);
}

@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteRegion(@PathVariable("id") Long id)
{
regionService.deleteRegionById(id);
}

@RequestMapping(value="/regpays/{idPays}",method = RequestMethod.GET)
public List<Region> getRegionsByidPays(@PathVariable("idPays") Long idPays) {
return regionService.findBypays(idPays);
}
}
