package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.TypeAbri;
import fr.eql.ai109.tontapat.idao.TypeAbriIDAO;

@Remote(TypeAbriIDAO.class)
@Stateless
public class TypeAbriDAO extends GenericDAO<TypeAbri> implements TypeAbriIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
