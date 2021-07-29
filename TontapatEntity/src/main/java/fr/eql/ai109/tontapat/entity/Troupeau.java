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

@Table(name = "Troupeau")
@Entity
@Setter
@Getter
public class Troupeau implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "effectif")
	private int effectif;
	@Column(name = "nom")
	private String nom;
	@Column(name = "description")
	private String description;
	@Column(name = "adresseVoie")
	private String adresseVoie;
	@Column(name = "adresseLong")
	private float adresseLong;
	@Column(name = "adresseLat")
	private float adresseLat;
	@Column(name = "dateAjout")
	private java.util.Date dateAjout;
	@Column(name = "dateDisponibilite")
	private java.util.Date dateDisponibilite;
	@Column(name = "dateRetrait")
	private java.util.Date dateRetrait;
	@Column(name = "divisibilite")
	private boolean divisibilite;
	@Column(name = "dateModification")
	private java.util.Date dateModification;

}