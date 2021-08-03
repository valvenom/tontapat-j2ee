package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Reclamation;

public interface ReclamationIBusiness {
	List<Reclamation> findAll();
	Reclamation add();
	Reclamation getById(int id);
	Reclamation update(Reclamation reclamation);
	Reclamation remove(Reclamation reclamation);
}
