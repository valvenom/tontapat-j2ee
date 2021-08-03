package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.SeuilTarification;
import fr.eql.ai109.tontapat.idao.SeuilTarificationIDAO;

@Remote(SeuilTarificationIDAO.class)
@Stateless
public class SeuilTarificationDAO extends GenericDAO<SeuilTarification> implements SeuilTarificationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
