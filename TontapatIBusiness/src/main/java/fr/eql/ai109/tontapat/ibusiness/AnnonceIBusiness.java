package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Annonce;

public interface AnnonceIBusiness {
	List<Annonce> findAll();
	Annonce add();
	Annonce getById(int id);
	Annonce update(Annonce offre);
	Annonce remove(Annonce offre);
}
