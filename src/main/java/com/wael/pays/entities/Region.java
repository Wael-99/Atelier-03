package com.wael.pays.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Region {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomRegion;
	private double surface;
	
	@ManyToOne
	private pays pays;
	
	
	
	
	public Region() {
		super();
	}

	public Region(Long id, String nomRegion, double surface,pays pays) {
		super();
		this.id = id;
		this.nomRegion = nomRegion;
		this.surface = surface;
		this.pays = pays;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNomRegion() {
		return nomRegion;
	}




	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}




	public double getSurface() {
		return surface;
	}




	public void setSurface(double surface) {
		this.surface = surface;
	}




	public pays getPays() {
		return pays;
	}




	public void setPays(pays pays) {
		this.pays = pays;
	}




	@Override
	public String toString() {
		return "Region [id=" + id + ", nomRegion=" + nomRegion + ", surface=" + surface + ", pays=" + pays + "]";
	}


}
