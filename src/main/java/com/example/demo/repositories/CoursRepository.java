package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long>{

}
