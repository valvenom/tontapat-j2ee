package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.TypeIntervention;
import fr.eql.ai109.tontapat.idao.TypeInterventionIDAO;

@Remote(TypeInterventionIDAO.class)
@Stateless
public class TypeInterventionDAO extends GenericDAO<TypeIntervention> implements TypeInterventionIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
