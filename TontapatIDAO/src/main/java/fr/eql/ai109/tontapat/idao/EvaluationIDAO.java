package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Evaluation;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface EvaluationIDAO extends GenericIDAO<Evaluation> {
	
	List<Evaluation> getEvaluationsDoneByUtilisateur(Utilisateur utilisateur);
	List<Evaluation> getEvaluationsTargetingUtilisateur(Utilisateur utilisateur);

}
