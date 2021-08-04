package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainIDAO;

@Remote(TerrainIBusiness.class)
@Stateless
public class TerrainBusiness implements TerrainIBusiness {

	@EJB
	private TerrainIDAO terrainIDAO;

	@Override
	public List<Terrain> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terrain add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terrain getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terrain update(Terrain terrain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terrain remove(Terrain terrain) {
		// TODO Auto-generated method stub
		return null;
	}

}