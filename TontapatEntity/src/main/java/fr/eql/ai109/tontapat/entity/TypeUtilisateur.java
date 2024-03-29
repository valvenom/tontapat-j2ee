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

@Table(name = "type_utilisateur")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TypeUtilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_utilisateur", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "typeUtilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Utilisateur> utilisateurs;
}