package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Etudiant implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricule ;
	private String nom;
	private String prenom;
	@Column(name = "moyenne")
	private float moyenne;
	@Temporal(TemporalType.DATE)
	private Date Date_de_naissance ;
	@ManyToMany(mappedBy= "etudiants")
	private List<Cours>cours;
	@ManyToOne
	private Universite universite;
	@OneToOne
	private Inscription inscription;
	
	


}