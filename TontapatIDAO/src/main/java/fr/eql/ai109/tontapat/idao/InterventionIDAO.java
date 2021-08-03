package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Intervention;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface InterventionIDAO extends GenericIDAO<Intervention> {
	List<Intervention> getInterventionsByUtilisateur(Utilisateur utilisateur);
	List<Intervention> getInterventionsByPrestation(Prestation prestation);

}
