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
import lombok.Getter;
import lombok.Setter;

@Table(name = "intervention")
@Entity
@Setter
@Getter
public class Intervention implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_intervention", nullable = false)
	private int id;
	@Column(name = "descriptif")
	private String descriptif;
	@Column(name = "date_demande")
	private Date dateDemande;
	@Column(name = "date_validation")
	private Date dateValidation;
	@Column(name = "date_intervention")
	private Date dateIntervention;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_type_intervention")
	private TypeIntervention typeIntervention;
	
}