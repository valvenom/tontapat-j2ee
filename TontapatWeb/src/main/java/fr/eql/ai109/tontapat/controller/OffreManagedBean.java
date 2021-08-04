package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.ibusiness.OffreIBusiness;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "mbOffre")
@SessionScoped
@Getter
@Setter
public class OffreManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Offre offre;
	
	@EJB
	private OffreIBusiness offreIBusiness;
}