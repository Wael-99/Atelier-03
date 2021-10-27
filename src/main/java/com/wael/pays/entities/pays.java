package com.wael.pays.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class pays {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPays;
	private String nomPays;
	private String continent;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "pays")
	private List<Region> regions;


	@Override
	public String toString() {
		return "pays [idpays=" + idPays + ", nompays=" + nomPays + ", continent=" + continent + "]";
	}
	
	
	
	
	
	
}
