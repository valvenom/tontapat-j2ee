package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIBusiness.class)
@Stateless
public class PrestationBusiness implements PrestationIBusiness {

	@EJB
	private PrestationIDAO prestationIDAO;

	@Override
	public List<Prestation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation update(Prestation prestation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation remove(Prestation prestation) {
		// TODO Auto-generated method stub
		return null;
	}

}