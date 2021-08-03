package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.TypeVegetation;
import fr.eql.ai109.tontapat.idao.TypeVegetationIDAO;

@Remote(TypeVegetationIDAO.class)
@Stateless
public class TypeVegetationDAO extends GenericDAO<TypeVegetation> implements TypeVegetationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
