package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.ConditionAnnulation;
import fr.eql.ai109.tontapat.idao.ConditionAnnulationIDAO;



@Remote(ConditionAnnulationIDAO.class)
@Stateless
public class ConditionAnnulationDAO extends GenericDAO<ConditionAnnulation> implements ConditionAnnulationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
