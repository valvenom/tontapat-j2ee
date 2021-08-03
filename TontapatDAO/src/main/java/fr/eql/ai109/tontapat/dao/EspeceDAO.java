package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Espece;
import fr.eql.ai109.tontapat.idao.EspeceIDAO;

@Remote(EspeceIDAO.class)
@Stateless
public class EspeceDAO extends GenericDAO<Espece> implements EspeceIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
