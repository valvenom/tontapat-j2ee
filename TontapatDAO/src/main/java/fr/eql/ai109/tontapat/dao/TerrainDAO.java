package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.TerrainIDAO;

@Remote(TerrainIDAO.class)
@Stateless
public class TerrainDAO extends GenericDAO<Terrain> implements TerrainIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
	@Override
	public List<Terrain> getTerrainsByUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
