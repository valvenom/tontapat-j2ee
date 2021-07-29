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

@Table(name = "Utilisateur")
@Entity
@Setter
@Getter
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "motDePasse")
	private String motDePasse;
	@Column(name = "dateNaissance")
	private java.util.Date dateNaissance;
	@Column(name = "dateInscription")
	private java.util.Date dateInscription;
	@Column(name = "photoProfil")
	private String photoProfil;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "raisonSociale")
	private String raisonSociale;
	@Column(name = "adresseVoie")
	private String adresseVoie;
	@Column(name = "adresseLong")
	private float adresseLong;
	@Column(name = "adresseLat")
	private float adresseLat;
	@Column(name = "carteNumero")
	private String carteNumero;
	@Column(name = "carteExpiration")
	private java.util.Date carteExpiration;
	@Column(name = "carteCVC")
	private String carteCVC;
	@Column(name = "virementIBAN")
	private String virementIBAN;
	@Column(name = "virementBIC")
	private String virementBIC;
	@Column(name = "paypalEmail")
	private String paypalEmail;
	@Column(name = "dateDesactivation")
	private java.util.Date dateDesactivation;
	@Column(name = "dateModification")
	private java.util.Date dateModification;
	@Column(name = "textePresentation")
	private String textePresentation;
	@Column(name = "numeroTelephone")
	private String numeroTelephone;

}