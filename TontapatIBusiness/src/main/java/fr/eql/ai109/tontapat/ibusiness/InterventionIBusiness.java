package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Intervention;

public interface InterventionIBusiness {
	List<Intervention> findAll();
	Intervention add();
	Intervention getById(int id);
	Intervention update(Intervention intervention);
	Intervention remove(Intervention intervention);
}
