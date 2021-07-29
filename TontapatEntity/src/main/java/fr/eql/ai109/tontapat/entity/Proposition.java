package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Proposition")
@Entity
@Setter
@Getter
public class Proposition implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "dateCreation")
	private java.util.Date dateCreation;
	@Column(name = "dateAnnulation")
	private java.util.Date dateAnnulation;
	@Column(name = "dateValidation")
	private java.util.Date dateValidation;
	@Column(name = "dateRefus")
	private java.util.Date dateRefus;
	@Column(name = "description")
	private String description;
	@Column(name = "dateDebutPrestation")
	private java.util.Date dateDebutPrestation;
	@Column(name = "dateFinPrestation")
	private java.util.Date dateFinPrestation;
	@Column(name = "prixPropose")
	private float prixPropose;
	@Column(name = "typeInstallation")
	private boolean typeInstallation;

}