package com.masterdev.curso.springboot.clube.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masterdev.curso.springboot.clube.model.entity.Clube;

@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long> {

}
