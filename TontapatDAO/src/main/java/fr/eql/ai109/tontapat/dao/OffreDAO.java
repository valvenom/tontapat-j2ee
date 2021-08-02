package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.OffreIDAO;

@Remote(OffreIDAO.class)
@Stateless
public class OffreDAO extends GenericDAO<Offre> implements OffreIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
	@Override
	public List<Offre> getOffresByUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
