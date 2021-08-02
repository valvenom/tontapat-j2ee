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

@Table(name = "reclamation")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Reclamation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reclamation", nullable = false)
	private int id;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "date_traitement")
	private Date dateTraitement;
	@Column(name = "descriptif")
	private String descriptif;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_reclamation")
	private MotifReclamation motifReclamation;
	
}