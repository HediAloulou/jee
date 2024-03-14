package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Cours;
import com.example.demo.entities.Etudiant;
import com.example.demo.repositories.EtudiantRepository;
import com.example.services.EtudiantService;
import com.example.services.EtudiantServiceImpl;

import jakarta.transaction.Transactional;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner{
	
	@Autowired
    private EtudiantService etudiantservice;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	
    	Date date = new Date();
    	Etudiant etudiant1 = new Etudiant(1L, "hedi", "Aloulou", 13f, date, null, null, null);
    	Etudiant etudiant2 = new Etudiant(2L, "zied", "koubaa", 25f, date, null,null,null);
    	Cours cours = new Cours(2L,"math",null);
    	etudiantservice.EnregistrerEtudiant(etudiant1);
    	etudiantservice.EnregistrerEtudiant(etudiant2);
    	
 /*   	
    
    	Date date = new Date();
    	
    	Etudiant etudiant = new Etudiant(1L, "hedi", "Aloulou", 13f, date, null);
        etudiantRepository.save(etudiant);
        Etudiant etudiant1 = new Etudiant(2L,"zied", "koubaa", 15, date, null);
        etudiantRepository.save(etudiant1);
        Etudiant etudiant2 = new Etudiant(3L,"zied", "koubaa", 15, date, null);
        etudiantRepository.save(etudiant2);
        // remove
        etudiantRepository.delete(etudiant);
        System.out.println("letudiant a été supprimé");
        List<Etudiant> ee = etudiantRepository.findAll();
        for (int i = 0; i < ee.size(); i++) {
        	 
            // Print all elements of List
            System.out.println(ee.get(i));
        }
        //update 1 ere methode
        Etudiant e = etudiantRepository.findById(2L).get();
        e.setMoyenne((float) 15.5);
        etudiantRepository.save(e);
        // update 2eme methode
        etudiantRepository.updpateEtudiant("hedi", 3L);
        
        // Recherche un etudiant dont le nom contient un mot clé
        etudiantRepository.searsearchByNom("hedi");
        

    	List<Etudiant> listee = etudiantRepository.findBfindByNomAndMoyenneGreaterThan("zied" ,(float)15.5);
    	for(Etudiant es :listee)
    	{
    		System.out.println("famma");
    		System.out.println(es);
    	}
    	
    	etudiantRepository.countEtudiantperyear();
    }
    */
   
}
}