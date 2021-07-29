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

@Table(name = "Prestation")
@Entity
@Setter
@Getter
public class Prestation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "dateReservation")
	private java.util.Date dateReservation;
	@Column(name = "dateValidation")
	private java.util.Date dateValidation;
	@Column(name = "numReservation")
	private int numReservation;
	@Column(name = "dateRefus")
	private java.util.Date dateRefus;
	@Column(name = "dateAnnulation")
	private java.util.Date dateAnnulation;
	@Column(name = "descriptionAnnulation")
	private String descriptionAnnulation;
	@Column(name = "prixConvenu")
	private float prixConvenu;
	@Column(name = "dateDebut")
	private java.util.Date dateDebut;
	@Column(name = "dateFin")
	private java.util.Date dateFin;
	@Column(name = "typeInstallation")
	private boolean typeInstallation;
	@Column(name = "dateDebutInstallation")
	private java.util.Date dateDebutInstallation;
	@Column(name = "dateFinInstallation")
	private java.util.Date dateFinInstallation;
	@Column(name = "dateApportTroupeau")
	private java.util.Date dateApportTroupeau;
	@Column(name = "dateRecuperationTroupeau")
	private java.util.Date dateRecuperationTroupeau;
	@Column(name = "dateDebutDesinstallation")
	private java.util.Date dateDebutDesinstallation;
	@Column(name = "dateFinDesinstallation")
	private java.util.Date dateFinDesinstallation;
	@Column(name = "frequenceIntervention")
	private int frequenceIntervention;

}