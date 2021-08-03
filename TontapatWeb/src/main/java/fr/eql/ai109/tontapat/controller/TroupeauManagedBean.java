package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.ibusiness.TroupeauIBusiness;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "mbTroupeau")
@SessionScoped
@Getter
@Setter
public class TroupeauManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Troupeau troupeau;
	
	@EJB
	private TroupeauIBusiness troupeauIBusiness;
}