package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Proposition;
import fr.eql.ai109.tontapat.ibusiness.PropositionIBusiness;
import fr.eql.ai109.tontapat.idao.PropositionIDAO;

@Remote(PropositionIBusiness.class)
@Stateless
public class PropositionBusiness implements PropositionIBusiness {

	@EJB
	private PropositionIDAO propositionIDAO;

	@Override
	public List<Proposition> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proposition add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proposition getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proposition update(Proposition proposition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proposition remove(Proposition proposition) {
		// TODO Auto-generated method stub
		return null;
	}

}