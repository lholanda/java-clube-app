package com.masterdev.curso.springboot.clube.model.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clube")
@EntityListeners(AuditingEntityListener.class) // o JPA vai preencher automaticamente os campos createdAt e updatedAt
public class Clube {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(name = "nome") // nao necessario pois nao ira mudar o nome da coluna
    private String nome;

    private String cnpj;

    @Column(name = "conta_corrente") // garante que o nome da coluna no banco de dados seja conta_corrente
    private String contaCorrente;

    @Column(name = "agencia")
    private String agencia;

    @Column(name = "nome_banco")
    private String nomeBanco;

    @Column(name = "created_at")
    @CreatedDate // será preechido automaticamente pelo JPA, quando o registro for criado
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @LastModifiedDate // será preechido automaticamente pelo JPA, quando o registro for atualizado
    private LocalDateTime updatedAt;

    // construtor vazio para o JPA funcionar
    public Clube() {
    }

    // construtor com todos os atributos, menos os campos de data
    public Clube(Long id, String nome, String cnpj, String contaCorrente, String agencia, String nomeBanco) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contaCorrente = contaCorrente;
        this.agencia = agencia;
        this.nomeBanco = nomeBanco;
    }

    // getters e setters
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
