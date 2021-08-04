package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Reclamation;
import fr.eql.ai109.tontapat.ibusiness.ReclamationIBusiness;
import fr.eql.ai109.tontapat.idao.ReclamationIDAO;

@Remote(ReclamationIBusiness.class)
@Stateless
public class ReclamationBusiness implements ReclamationIBusiness {

	@EJB
	private ReclamationIDAO reclamationIDAO;

	@Override
	public List<Reclamation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reclamation add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reclamation getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reclamation update(Reclamation reclamation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reclamation remove(Reclamation reclamation) {
		// TODO Auto-generated method stub
		return null;
	}

}