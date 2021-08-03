package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.MotifAnnulation;
import fr.eql.ai109.tontapat.idao.MotifAnnulationIDAO;

@Remote(MotifAnnulationIDAO.class)
@Stateless
public class MotifAnnulationDAO extends GenericDAO<MotifAnnulation> implements MotifAnnulationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
