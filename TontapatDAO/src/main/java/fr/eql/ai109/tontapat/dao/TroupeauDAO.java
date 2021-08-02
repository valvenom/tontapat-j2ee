package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.TroupeauIDAO;

@Remote(TroupeauIDAO.class)
@Stateless
public class TroupeauDAO extends GenericDAO<Troupeau> implements TroupeauIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
	@Override
	public List<Troupeau> getTroupeauxByUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
