package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.ibusiness.OffreIBusiness;
import fr.eql.ai109.tontapat.idao.OffreIDAO;

@Remote(OffreIBusiness.class)
@Stateless
public class OffreBusiness implements OffreIBusiness {

	@EJB
	private OffreIDAO offreIDAO;

	@Override
	public Offre add(Offre offre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Offre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offre update(Offre offre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offre remove(Offre offre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Offre> search(OffreSearch offreSearch) {
		// TODO Auto-generated method stub
		return null;
	}

	
}