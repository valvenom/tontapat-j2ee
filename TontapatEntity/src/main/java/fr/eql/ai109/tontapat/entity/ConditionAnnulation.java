package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "condition_annulation")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ConditionAnnulation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_condition_annulation", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "delai_jours")
	private int delaiJours;
	@Column(name = "pourcentage_facturation")
	private float pourcentageFacturation;
	@OneToMany(mappedBy = "conditionAnnulation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Offre> offres;
	@OneToMany(mappedBy = "conditionAnnulation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
}