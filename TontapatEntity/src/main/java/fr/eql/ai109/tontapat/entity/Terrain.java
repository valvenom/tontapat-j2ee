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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "terrain")
@Entity
@Setter
@Getter
public class Terrain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terrain", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "superficie")
	private float superficie;
	@Column(name = "description")
	private String description;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "adresse_lat")
	private float adresseLat;
	@Column(name = "adresse_long")
	private float adresseLong;
	@Column(name = "adresse_voie")
	private String adresseVoie;
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToMany
	@JoinTable(
			name = "terrain_morphologie",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_morphologie"))
	Set<Morphologie> morphologies;
	@ManyToMany
	@JoinTable(
			name = "terrain_type_vegetation",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_type_vegetation"))
	Set<TypeVegetation> typesVegetation;
	@ManyToMany
	@JoinTable(
			name = "terrain_type_cloture",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_type_cloture"))
	Set<TypeCloture> typesCloture;
	@ManyToMany
	@JoinTable(
			name = "terrain_type_abri",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_type_abri"))
	Set<TypeAbri> typesAbri;
	@ManyToMany
	@JoinTable(
			name = "terrain_type_abreuvoir",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_type_abreuvoir"))
	Set<TypeAbreuvoir> typesAbreuvoir;
	@OneToMany(mappedBy = "annonce", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Annonce> annonces;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
	
}