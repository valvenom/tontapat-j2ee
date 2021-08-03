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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "offre")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Offre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_offre", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "date_debut")
	private Date dateDebut;
	@Column(name = "date_fin")
	private Date dateFin;
	@Column(name = "description")
	private String description;
	@Column(name = "installation_assuree")
	private boolean installationAssuree;
	@Column(name = "prix_km")
	private float prixKm;
	@Column(name = "prix_installation")
	private float prixInstallation;
	@Column(name = "prix_intervention")
	private float prixIntervention;
	@Column(name = "prix_bete_jour")
	private float prixBeteJour;
	@Column(name = "zone_couverture")
	private int zoneCouverture;
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@Column(name = "frequence_intervention")
	private int frequenceIntervention;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_troupeau")
	private Troupeau troupeau;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_condition_annulation")
	private ConditionAnnulation conditionAnnulation;
	@OneToMany(mappedBy = "offre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
}