package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.AccountIBusiness;

@ManagedBean(name = "mbAccount")
@SessionScoped
public class AccountManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String email;
	private String password;
	private Utilisateur utilisateur;
	
	@EJB
	private AccountIBusiness accountIBusiness;
	
	public String connect() {
		String forward = null;
		utilisateur = accountIBusiness.connection(email, password);
		if (utilisateur != null) {
			forward = "/connectedPage.xhtml?faces-redirection=true";
		} else {
			FacesMessage facesMessage = new FacesMessage(
					FacesMessage.SEVERITY_WARN,
					"Identifiant et/ou mot de passe incorrect(s)",
					"Identifiant et/ou mot de passe incorrect(s)"
					);
			FacesContext.getCurrentInstance().addMessage("emailForm:inpEmail", facesMessage);
			FacesContext.getCurrentInstance().addMessage("emailForm:inpPassword", facesMessage);
			forward = "/email.xhtml?faces-redirection=false";
		}
		return forward;
	}
	
	public String disconnect() {
		HttpSession session = (HttpSession) FacesContext
				.getCurrentInstance()
				.getExternalContext()
				.getSession(true);
		session.invalidate();
		email = "";
		password = "";
		utilisateur = new Utilisateur();
		return "/email.xhtml?faces-redirection=true";
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}
