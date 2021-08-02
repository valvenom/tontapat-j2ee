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

@Table(name = "utilisateur")
@Entity
@Setter
@Getter
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utilisateur", nullable = false)
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "mot_de_passe")
	private String motDePasse;
	@Column(name = "date_naissance")
	private Date dateNaissance;
	@Column(name = "date_inscription")
	private Date dateInscription;
	@Column(name = "photo_profil")
	private String photoProfil;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "raison_sociale")
	private String raisonSociale;
	@Column(name = "adresse_voie")
	private String adresseVoie;
	@Column(name = "adresse_long")
	private float adresseLong;
	@Column(name = "adresse_lat")
	private float adresseLat;
	@Column(name = "carte_numero")
	private String carteNumero;
	@Column(name = "carte_expiration")
	private Date carteExpiration;
	@Column(name = "carte_cvc")
	private String carteCVC;
	@Column(name = "virement_iban")
	private String virementIBAN;
	@Column(name = "virement_bic")
	private String virementBIC;
	@Column(name = "paypal_email")
	private String paypalEmail;
	@Column(name = "date_desactivation")
	private Date dateDesactivation;
	@Column(name = "date_modification")
	private Date dateModification;
	@Column(name = "texte_presentation")
	private String textePresentation;
	@Column(name = "numero_telephone")
	private String numeroTelephone;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_type_utilisateur")
	private TypeUtilisateur typeUtilisateur;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Terrain> terrains;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Troupeau> troupeaux;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Proposition> propositions;
	@OneToMany(mappedBy = "utilisateurSource", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Evaluation> evaluationsFaites;
	@OneToMany(mappedBy = "utilisateurCible", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Evaluation> evaluationsRecues;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Reclamation> reclamations;
}