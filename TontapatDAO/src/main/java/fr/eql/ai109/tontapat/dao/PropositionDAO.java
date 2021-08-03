package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Proposition;
import fr.eql.ai109.tontapat.idao.PropositionIDAO;

@Remote(PropositionIDAO.class)
@Stateless
public class PropositionDAO extends GenericDAO<Proposition> implements PropositionIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
