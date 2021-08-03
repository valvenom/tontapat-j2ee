package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.entity.AnnonceSearch;

public interface AnnonceIBusiness {
	Annonce add(Annonce annonce);
	List<Annonce> findAll();
	Annonce update(Annonce annonce);
	Annonce remove(Annonce annonce);
	List<Annonce> search(AnnonceSearch annonceSearch);
}
