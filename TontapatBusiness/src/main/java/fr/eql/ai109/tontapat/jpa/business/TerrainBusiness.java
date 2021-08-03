package fr.eql.ai109.tontapat.jpa.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.idao.TerrainIDAO;
import fr.eql.ai109.tontapat.jpa.ibusiness.TerrainIBusiness;

@Remote(TerrainIBusiness.class)
@Stateless
public class TerrainBusiness implements TerrainIBusiness{

	@EJB
	private TerrainIDAO terrainIDao;
	
	
	@Override
	public List<Terrain> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
