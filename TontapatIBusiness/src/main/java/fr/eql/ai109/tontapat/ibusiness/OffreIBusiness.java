package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreSearch;

public interface OffreIBusiness {
	Offre add(Offre offre);
	List<Offre> findAll();
	Offre update(Offre offre);
	Offre remove(Offre offre);
	List<Offre> search(OffreSearch offreSearch);
}
