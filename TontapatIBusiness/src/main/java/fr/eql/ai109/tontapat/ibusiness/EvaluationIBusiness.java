package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Evaluation;

public interface EvaluationIBusiness {
	List<Evaluation> findAll();
	Evaluation add();
	Evaluation getById(int id);
	Evaluation update(Evaluation evaluation);
	Evaluation remove(Evaluation evaluation);
}
