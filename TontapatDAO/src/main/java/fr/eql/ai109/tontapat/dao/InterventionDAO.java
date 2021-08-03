package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Intervention;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.InterventionIDAO;

@Remote(InterventionIDAO.class)
@Stateless
public class InterventionDAO extends GenericDAO<Intervention> implements InterventionIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
	@Override
	public List<Intervention> getInterventionsByUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Intervention> getInterventionsByPrestation(Prestation prestation) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
