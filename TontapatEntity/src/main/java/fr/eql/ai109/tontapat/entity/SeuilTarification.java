package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "seuil_tarification")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SeuilTarification implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_seuil", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prix_km")
	private float prixKm;
	@Column(name = "prix_bete_jour")
	private float prixBeteJour;
	@Column(name = "coef_intervention")
	private float coefIntervention;
	@Column(name = "coef_installation")
	private float coefInstallation;

}