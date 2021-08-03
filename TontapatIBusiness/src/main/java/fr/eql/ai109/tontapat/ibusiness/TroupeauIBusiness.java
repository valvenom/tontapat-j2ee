package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Troupeau;

public interface TroupeauIBusiness {
	List<Troupeau> findAll();
	Troupeau add();
	Troupeau getById(int id);
	Troupeau update(Troupeau troupeau);
	Troupeau remove(Troupeau troupeau);
}
