package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "proposition")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Proposition implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proposition", nullable = false)
	private int id;
	@Column(name = "date_creation")
	private Date dateCreation;
	@Column(name = "date_annulation")
	private Date dateAnnulation;
	@Column(name = "date_validation")
	private Date dateValidation;
	@Column(name = "date_refus")
	private Date dateRefus;
	@Column(name = "description")
	private String description;
	@Column(name = "date_debut_prestation")
	private Date dateDebutPrestation;
	@Column(name = "date_fin_prestation")
	private Date dateFinPrestation;
	@Column(name = "prix_propose")
	private float prixPropose;
	@Column(name = "type_installation")
	private boolean typeInstallation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_troupeau")
	private Troupeau troupeau;
	
}