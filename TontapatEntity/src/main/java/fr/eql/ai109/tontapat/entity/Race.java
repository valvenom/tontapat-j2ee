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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "race")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Race implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_race", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_espece")
	private Espece espece;
}