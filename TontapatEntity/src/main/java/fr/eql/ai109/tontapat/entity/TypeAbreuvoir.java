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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "type_abreuvoir")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TypeAbreuvoir implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_abreuvoir", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@ManyToMany(mappedBy = "typesAbreuvoir")
	private Set<Terrain> terrains;
}