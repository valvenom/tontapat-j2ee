package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "type_vegetation")
@Entity
@Setter
@Getter
public class TypeVegetation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_vegetation", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@ManyToMany
	Set<Terrain> terrains;
	@ManyToMany
	Set<Espece> especes;
}