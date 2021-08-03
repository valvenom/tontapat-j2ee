package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Race;
import fr.eql.ai109.tontapat.idao.RaceIDAO;

@Remote(RaceIDAO.class)
@Stateless
public class RaceDAO extends GenericDAO<Race> implements RaceIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
