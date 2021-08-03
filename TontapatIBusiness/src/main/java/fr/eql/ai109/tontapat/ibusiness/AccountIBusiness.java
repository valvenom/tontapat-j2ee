package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface AccountIBusiness {
	
	Utilisateur connection(String login, String password);
	List<Utilisateur> findAll();
	Utilisateur add();
	Utilisateur getById(int id);
	Utilisateur update(Utilisateur utilisateur);
	Utilisateur remove(Utilisateur utilisateur);
}
