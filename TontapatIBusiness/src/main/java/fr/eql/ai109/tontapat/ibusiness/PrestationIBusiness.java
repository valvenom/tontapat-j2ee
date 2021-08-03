package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Prestation;

public interface PrestationIBusiness {
	List<Prestation> findAll();
	Prestation add();
	Prestation getById(int id);
	Prestation update(Prestation prestation);
	Prestation remove(Prestation prestation);
}
