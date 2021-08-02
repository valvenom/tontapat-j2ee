package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.AnnonceIDAO;

@Remote(AnnonceIDAO.class)
@Stateless
public class AnnonceDAO extends GenericDAO<Annonce> implements AnnonceIDAO {

	EntityManager em = null;
	EntityTransaction tx = null;
	
	@Override
	public List<Annonce> getAnnoncesByUtilisateur(Utilisateur utilisateur) {
		return null;
	}

}
