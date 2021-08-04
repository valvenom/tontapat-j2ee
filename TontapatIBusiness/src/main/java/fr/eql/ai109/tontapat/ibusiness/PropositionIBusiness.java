package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Proposition;

public interface PropositionIBusiness {
	List<Proposition> findAll();
	Proposition add();
	Proposition getById(int id);
	Proposition update(Proposition proposition);
	Proposition remove(Proposition proposition);
}
