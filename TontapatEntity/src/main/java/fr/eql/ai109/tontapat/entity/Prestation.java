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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "prestation")
@Entity
@Setter
@Getter
public class Prestation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestation", nullable = false)
	private int id;
	@Column(name = "date_reservation")
	private Date dateReservation;
	@Column(name = "date_validation")
	private Date dateValidation;
	@Column(name = "num_reservation")
	private int numReservation;
	@Column(name = "date_refus")
	private Date dateRefus;
	@Column(name = "date_annulation")
	private Date dateAnnulation;
	@Column(name = "description_annulation")
	private String descriptionAnnulation;
	@Column(name = "prix_convenu")
	private float prixConvenu;
	@Column(name = "date_debut")
	private Date dateDebut;
	@Column(name = "date_fin")
	private Date dateFin;
	@Column(name = "type_installation")
	private boolean typeInstallation;
	@Column(name = "date_debut_installation")
	private Date dateDebutInstallation;
	@Column(name = "date_fin_installation")
	private Date dateFinInstallation;
	@Column(name = "date_apport_troupeau")
	private Date dateApportTroupeau;
	@Column(name = "date_recuperation_troupeau")
	private Date dateRecuperationTroupeau;
	@Column(name = "date_debut_desinstallation")
	private Date dateDebutDesinstallation;
	@Column(name = "date_fin_desinstallation")
	private Date dateFinDesinstallation;
	@Column(name = "frequence_intervention")
	private int frequenceIntervention;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_terrain")
	private Terrain terrain;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_troupeau")
	private Troupeau troupeau;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_offre")
	private Offre offre;
	@OneToOne(mappedBy = "prestation")
	private Annonce annonce;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_refus")
	private MotifRefusReservation motifRefusReservation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_annulation")
	private MotifAnnulation motifAnnulation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_condition_annulation")
	private ConditionAnnulation conditionAnnulation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_reclamation")
	private MotifReclamation motifReclamation;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Proposition> propositions;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Reclamation> reclamations;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Intervention> interventions;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Evaluation> evaluations;
	
}