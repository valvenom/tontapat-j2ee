package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.entity.AnnonceSearch;
import fr.eql.ai109.tontapat.ibusiness.AnnonceIBusiness;
import fr.eql.ai109.tontapat.idao.AnnonceIDAO;

@Remote(AnnonceIBusiness.class)
@Stateless
public class AnnonceBusiness implements AnnonceIBusiness {

	@EJB
	private AnnonceIDAO annonceIDAO;

	@Override
	public Annonce add(Annonce annonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Annonce update(Annonce annonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Annonce remove(Annonce annonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> search(AnnonceSearch annonceSearch) {
		// TODO Auto-generated method stub
		return null;
	}
	
}