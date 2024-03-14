package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {

}
