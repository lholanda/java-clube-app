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

    @Column(name = "nome")
    private String nome;

    @Column(name = "rg")
    private String rg;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "data_nascimento")
    private LocalDateTime dataNascimento;

    @Column(name = "posicao")
    @Enumerated(EnumType.STRING)
    private PosicaoJogador posicao;

    @Column(name = "peso")
    private BigDecimal peso;

    @Column(name = "altura")
    private BigDecimal altura;

    @Column(name = "created_at")
    @CreatedDate // será preechido automaticamente pelo JPA, quando o registro for criado
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @LastModifiedDate // será preechido automaticamente pelo JPA, quando o registro for atualizado
    private LocalDateTime updatedAt;

    public Jogador() {
    }

    public Jogador(Long id, String nome, String rg, String cpf, String nacionalidade, 
                   LocalDateTime dataNascimento,
                   PosicaoJogador posicao, BigDecimal peso, BigDecimal altura) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.posicao = posicao;
        this.peso = peso;
        this.altura = altura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PosicaoJogador getPosicao() {
        return posicao;
    }

    public void setPosicao(PosicaoJogador posicao) {
        this.posicao = posicao;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    

}
