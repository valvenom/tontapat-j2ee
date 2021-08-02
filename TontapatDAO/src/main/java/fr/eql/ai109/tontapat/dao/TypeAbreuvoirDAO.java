package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.TypeAbreuvoir;
import fr.eql.ai109.tontapat.idao.TypeAbreuvoirIDAO;

@Remote(TypeAbreuvoirIDAO.class)
@Stateless
public class TypeAbreuvoirDAO extends GenericDAO<TypeAbreuvoir> implements TypeAbreuvoirIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
