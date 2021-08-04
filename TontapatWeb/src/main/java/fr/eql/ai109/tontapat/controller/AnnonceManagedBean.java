package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.ibusiness.AnnonceIBusiness;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "mbAnnonce")
@SessionScoped
@Getter
@Setter
public class AnnonceManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Annonce annonce;
	
	@EJB
	private AnnonceIBusiness annonceIBusiness;
}