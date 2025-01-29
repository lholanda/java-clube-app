package com.masterdev.curso.springboot.jogador.model.entity;

import java.math.BigDecimal;
import java.sql.DataTruncation;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.masterdev.curso.springboot.jogador.type.PosicaoJogador;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jogador")
@EntityListeners(AuditingEntityListener.class) // o JPA vai preencher automaticamente os campos createdAt e updatedAt
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    
    @Column(name="nome")
    private String nome;
    private String rg;
    private String cpf;

    private String nacionalidade;
    private LocalDateTime dataNascimento;

    @Enumerated(EnumType.STRING)
    private PosicaoJogador posicao;

    private BigDecimal peso;
    private BigDecimal altura;

    @Column(name = "created_at")
    @CreatedDate // será preechido automaticamente pelo JPA, quando o registro for criado
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @LastModifiedDate // será preechido automaticamente pelo JPA, quando o registro for atualizado
    private LocalDateTime updatedAt;
}
