package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface PrestationIDAO extends GenericIDAO<Prestation> {
	List<Prestation> getPrestationsByUtilisateur(Utilisateur utilisateur);

}
