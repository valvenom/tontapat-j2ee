package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Offre;

public interface OffreIBusiness {
	List<Offre> findAll();
	Offre add();
	Offre getById(int id);
	Offre update(Offre offre);
	Offre remove(Offre offre);
}
