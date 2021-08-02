package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.MotifReclamation;
import fr.eql.ai109.tontapat.idao.MotifReclamationIDAO;

@Remote(MotifReclamationIDAO.class)
@Stateless
public class MotifReclamationDAO extends GenericDAO<MotifReclamation> implements MotifReclamationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
