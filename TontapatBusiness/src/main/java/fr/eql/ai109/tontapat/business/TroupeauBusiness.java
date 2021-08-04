package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.ibusiness.TroupeauIBusiness;
import fr.eql.ai109.tontapat.idao.TroupeauIDAO;

@Remote(TroupeauIBusiness.class)
@Stateless
public class TroupeauBusiness implements TroupeauIBusiness {

	@EJB
	private TroupeauIDAO troupeauIDAO;

	@Override
	public List<Troupeau> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Troupeau add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Troupeau getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Troupeau update(Troupeau troupeau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Troupeau remove(Troupeau troupeau) {
		// TODO Auto-generated method stub
		return null;
	}

}