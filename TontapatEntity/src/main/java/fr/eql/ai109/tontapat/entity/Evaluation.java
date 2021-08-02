package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "evaluation")
@Entity
@Setter
@Getter
public class Evaluation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evaluation", nullable = false)
	private int id;
	@Column(name = "note")
	private int note;
	@Column(name = "commentaire")
	private String commentaire;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateurSource;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateurCible;
}