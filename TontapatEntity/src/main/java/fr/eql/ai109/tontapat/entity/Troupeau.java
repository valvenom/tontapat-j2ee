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

@Table(name = "troupeau")
@Entity
@Setter
@Getter
public class Troupeau implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_troupeau", nullable = false)
	private int id;
	@Column(name = "effectif")
	private int effectif;
	@Column(name = "nom")
	private String nom;
	@Column(name = "description")
	private String description;
	@Column(name = "adresse_voie")
	private String adresseVoie;
	@Column(name = "adresse_long")
	private float adresseLong;
	@Column(name = "adresse_lat")
	private float adresseLat;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "date_disponibilite")
	private Date dateDisponibilite;
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@Column(name = "divisibilite")
	private boolean divisibilite;
	@Column(name = "date_modification")
	private Date dateModification;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_race")
	private Race race;
	@OneToMany(mappedBy = "troupeau", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Offre> offres;
	@OneToMany(mappedBy = "troupeau", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
	@OneToMany(mappedBy = "troupeau", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Proposition> proposition;
	
	
}