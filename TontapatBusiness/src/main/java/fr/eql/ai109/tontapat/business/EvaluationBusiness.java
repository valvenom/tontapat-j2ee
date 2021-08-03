package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Evaluation;
import fr.eql.ai109.tontapat.ibusiness.EvaluationIBusiness;
import fr.eql.ai109.tontapat.idao.EvaluationIDAO;

@Remote(EvaluationIBusiness.class)
@Stateless
public class EvaluationBusiness implements EvaluationIBusiness {

	@EJB
	private EvaluationIDAO evaluationIDAO;

	@Override
	public List<Evaluation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evaluation add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evaluation getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evaluation update(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evaluation remove(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return null;
	}

}