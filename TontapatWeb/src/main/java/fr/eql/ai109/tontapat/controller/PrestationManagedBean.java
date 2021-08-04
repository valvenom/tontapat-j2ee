package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "mbPrestation")
@SessionScoped
@Getter
@Setter
public class PrestationManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Prestation prestation;
	
	@EJB
	private PrestationIBusiness prestationIBusiness;
}