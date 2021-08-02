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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "espece")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Espece implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_espece", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@ManyToMany
	@JoinTable(
			name = "espece_type_vegetation",
			joinColumns = @JoinColumn(name = "id_espece"),
			inverseJoinColumns = @JoinColumn(name = "id_type_vegetation"))
	Set<TypeVegetation> typeVegetations;
	@ManyToMany
	@JoinTable(
			name = "espece_morphologie",
			joinColumns = @JoinColumn(name = "id_espece"),
			inverseJoinColumns = @JoinColumn(name = "id_morphologie"))
	Set<Morphologie> morphologie;
	@OneToMany(mappedBy = "espece", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Race> races;
}