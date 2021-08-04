package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Intervention;
import fr.eql.ai109.tontapat.ibusiness.InterventionIBusiness;
import fr.eql.ai109.tontapat.idao.InterventionIDAO;

@Remote(InterventionIBusiness.class)
@Stateless
public class InterventionBusiness implements InterventionIBusiness {

	@EJB
	private InterventionIDAO interventionIDAO;

	@Override
	public List<Intervention> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intervention add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intervention getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intervention update(Intervention intervention) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intervention remove(Intervention intervention) {
		// TODO Auto-generated method stub
		return null;
	}

}