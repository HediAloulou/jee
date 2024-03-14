package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Universite implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identite_universitaire")
	private Long id ;
	@Column(name = "nom_universite")
	private String nom;
	@OneToMany(mappedBy="universite")
	//fetch = fetchType.Eager : charger tous les attributs avec clé etrangere ken relation many to one , w ken many to many ma yekhouch lisy 
	//fetch = fetchType.Lazy :  charger tous les attributs sans clé etrangere ken relation many to one , w ken many to many ma yekhouch lisy
	// ken relation toufa bel many , par defaut Lazy
	// ken relation toufa bel one , par defaut eager
	
	private List<Etudiant>etudiants;
	
	
	
	
	
	
}
