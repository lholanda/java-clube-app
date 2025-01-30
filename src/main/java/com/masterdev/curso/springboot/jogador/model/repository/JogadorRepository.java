package com.masterdev.curso.springboot.jogador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masterdev.curso.springboot.jogador.model.entity.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    
}
