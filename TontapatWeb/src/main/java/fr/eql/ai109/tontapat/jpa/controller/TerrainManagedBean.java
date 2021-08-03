package fr.eql.ai109.tontapat.jpa.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.jpa.ibusiness.TerrainIBusiness;

@ManagedBean(name = "mbTerrain")
@SessionScoped
public class TerrainManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nom;
	
	@EJB
	private TerrainIBusiness terrainIBusiness;
	
	public Terrain add(Terrain terrain) {
		
		return terrain;
	}

}
