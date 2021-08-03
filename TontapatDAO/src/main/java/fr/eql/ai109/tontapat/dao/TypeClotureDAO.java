package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.TypeCloture;
import fr.eql.ai109.tontapat.idao.TypeClotureIDAO;

@Remote(TypeClotureIDAO.class)
@Stateless
public class TypeClotureDAO extends GenericDAO<TypeCloture> implements TypeClotureIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
