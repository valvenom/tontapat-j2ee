package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "morphologie")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Morphologie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_morphologie", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "morphologie")
	Set<TerrainMorphologie> terrainsMorphologie;
	@ManyToMany(mappedBy = "morphologies")
	Set<Espece> especes;
}