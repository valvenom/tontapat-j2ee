package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.Morphologie;
import fr.eql.ai109.tontapat.idao.MorphologieIDAO;

@Remote(MorphologieIDAO.class)
@Stateless
public class MorphologieDAO extends GenericDAO<Morphologie> implements MorphologieIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
