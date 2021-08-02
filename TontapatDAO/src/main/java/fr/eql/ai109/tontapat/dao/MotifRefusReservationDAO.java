package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eql.ai109.tontapat.entity.MotifRefusReservation;
import fr.eql.ai109.tontapat.idao.MotifRefusReservationIDAO;

@Remote(MotifRefusReservationIDAO.class)
@Stateless
public class MotifRefusReservationDAO extends GenericDAO<MotifRefusReservation> implements MotifRefusReservationIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
}
