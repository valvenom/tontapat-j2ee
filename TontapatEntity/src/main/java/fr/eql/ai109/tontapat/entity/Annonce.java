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

@Table(name = "annonce")
@Entity
@Setter
@Getter
public class Annonce implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_annonce", nullable = false)
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
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_terrain")
	private Terrain terrain;
	@OneToMany(mappedBy = "annonce", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
}