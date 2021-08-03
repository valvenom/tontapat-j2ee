package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIDAO.class)
@Stateless
public class PrestationDAO extends GenericDAO<Prestation> implements PrestationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
	@Override
	public List<Prestation> getPrestationsByUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
