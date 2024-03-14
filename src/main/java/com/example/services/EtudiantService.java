package com.example.services;

import com.example.demo.entities.Cours;
import com.example.demo.entities.Etudiant;

public interface EtudiantService {
void EnregistrerEtudiant(Etudiant etudiant);
void AjouterEtudiantCours(Long matricule,Cours cours);
}
