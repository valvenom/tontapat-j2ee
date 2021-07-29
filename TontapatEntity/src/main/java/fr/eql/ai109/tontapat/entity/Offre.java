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

@Table(name = "Offre")
@Entity
@Setter
@Getter
public class Offre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "dateAjout")
	private java.util.Date dateAjout;
	@Column(name = "dateDebut")
	private java.util.Date dateDebut;
	@Column(name = "dateFin")
	private java.util.Date dateFin;
	@Column(name = "description")
	private String description;
	@Column(name = "installationAssuree")
	private boolean installationAssuree;
	@Column(name = "prixKm")
	private float prixKm;
	@Column(name = "prixInstallation")
	private float prixInstallation;
	@Column(name = "prixIntervention")
	private float prixIntervention;
	@Column(name = "prixBeteJour")
	private float prixBeteJour;
	@Column(name = "zoneCouverture")
	private int zoneCouverture;
	@Column(name = "dateRetrait")
	private java.util.Date dateRetrait;
	@Column(name = "frequenceIntervention")
	private int frequenceIntervention;

}