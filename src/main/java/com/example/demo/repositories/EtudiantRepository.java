package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Etudiant;

import jakarta.transaction.Transactional;


public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

	//update function with query 
	@Transactional
	@Modifying
	@Query("update Etudiant e set e.nom= :n where e.matricule= :x")
	void updpateEtudiant(@Param("n") String nom,@Param("x") Long id);
	
	// recherche 
	//sol 1
	List<Etudiant> findByNomContains(String mc);
	//sol 2
	@Query("select e from Etudiant e where e.nom like :m")
	List<Etudiant> searsearchByNom(@Param("m") String mc);
	
	 List<Etudiant> findBfindByNomAndMoyenneGreaterThan(String mm,float d);
		
	 @Query("select year(e.Date_de_naissance),count(*) from Etudiant e Group By year(Date_de_naissance) Order By year(Date_de_naissance)")
		List<Object[]>countEtudiantperyear();	
}

