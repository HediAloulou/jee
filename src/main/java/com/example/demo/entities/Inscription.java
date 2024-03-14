package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Inscription implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identite_inscri")
	private Long id ;
	@Column(name = "frais_inscri")
	private double drais;
	@Column(name = "date_isncri")
	@Temporal(TemporalType.DATE)
	private Date date ;
	@OneToOne(mappedBy="inscription",fetch=FetchType.EAGER)
	private Etudiant etudiant;
}
