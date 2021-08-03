package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface AccountIBusiness {
	Utilisateur connection(String email, String password);
	List<Utilisateur> findAll();
	Utilisateur signup(Utilisateur utilisateur);
}
