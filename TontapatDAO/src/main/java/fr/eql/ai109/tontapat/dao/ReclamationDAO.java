package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Reclamation;
import fr.eql.ai109.tontapat.idao.ReclamationIDAO;

@Remote(ReclamationIDAO.class)
@Stateless
public class ReclamationDAO extends GenericDAO<Reclamation> implements ReclamationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
