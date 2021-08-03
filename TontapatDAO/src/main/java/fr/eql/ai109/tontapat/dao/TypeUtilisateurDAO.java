package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.TypeUtilisateur;
import fr.eql.ai109.tontapat.idao.TypeUtilisateurIDAO;

@Remote(TypeUtilisateurIDAO.class)
@Stateless
public class TypeUtilisateurDAO extends GenericDAO<TypeUtilisateur> implements TypeUtilisateurIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
