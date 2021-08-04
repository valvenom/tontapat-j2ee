package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.UtilisateurIDAO;



@Remote(UtilisateurIDAO.class)
@Stateless
public class UtilisateurDAO extends GenericDAO<Utilisateur> implements UtilisateurIDAO {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
	public Boolean exists(Utilisateur utilisateur) {
		List<Utilisateur> users = null;

			em = new EntityManagerHolder().getCurrentEntityManager();
			
			Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:emailParam");
			query.setParameter("emailParam", utilisateur.getEmail());
			System.out.println(query);
			users = query.getResultList();
			
		return users.size() > 0;
	}

	public Utilisateur authenticate(String email, String password) {
		Utilisateur utilisateur = null;
		List<Utilisateur> users = null;
					em = new EntityManagerHolder().getCurrentEntityManager();
		
			Query query =  em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:emailParam "
					+ "AND u.password=:passwordParam");
			query.setParameter("emailParam", email);
			query.setParameter("passwordParam", password);
			System.out.println(query);
			System.out.println("********************* HELLO WORLD *******************");
			users = query.getResultList();
			
		if (users.size() > 0) {
			utilisateur = users.get(0);
		}
		return utilisateur;
	}
}
