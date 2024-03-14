package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cours;
import com.example.demo.entities.Etudiant;
import com.example.demo.repositories.EtudiantRepository;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class EtudiantServiceImpl implements EtudiantService {
@Autowired
private EtudiantRepository etudiantRepo;

public void EnregistrerEtudiant(Etudiant etudiant)
{
	etudiantRepo.save(etudiant);
	System.out.println("etudiant enregistré");
	
}
@Override
public void AjouterEtudiantCours(Long matricule, Cours cours) {
	
	
}

}
