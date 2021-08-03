package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "terrain_morphologie")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TerrainMorphologie implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "id_terrain")
	private Terrain terrain;
	
	@ManyToOne
	@JoinColumn(name = "id_morphologie")
	private Morphologie morphologie;
	
	@Column(name = "pourcentage")
	private float pourcentage;
}