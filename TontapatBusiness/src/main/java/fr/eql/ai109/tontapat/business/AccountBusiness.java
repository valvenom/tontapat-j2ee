package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.AccountIBusiness;
import fr.eql.ai109.tontapat.idao.UtilisateurIDAO;

@Remote(AccountIBusiness.class)
@Stateless
public class AccountBusiness implements AccountIBusiness {

	@EJB
	private UtilisateurIDAO utilisateurIDAO;
	
	public Utilisateur connection(String login, String password) {
		return utilisateurIDAO.authenticate(login, password);
	}

	public List<Utilisateur> findAll() {
		return utilisateurIDAO.getAll();
	}

	@Override
	public Utilisateur add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur remove(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
}
