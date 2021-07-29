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

@Table(name = "Terrain")
@Entity
@Setter
@Getter
public class Terrain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "superficie")
	private float superficie;
	@Column(name = "description")
	private String description;
	@Column(name = "dateAjout")
	private String dateAjout;
	@Column(name = "adresseLat")
	private float adresseLat;
	@Column(name = "adresseLong")
	private float adresseLong;
	@Column(name = "adresseVoie")
	private String adresseVoie;
	@Column(name = "dateRetrait")
	private java.util.Date dateRetrait;

}