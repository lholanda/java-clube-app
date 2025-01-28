package com.masterdev.curso.springboot.clube.business.bo;

import java.time.LocalDateTime;

public class ClubeResponseVO {
    private Long id;
    private String nome;
    private String cnpj;
    private String contaCorrente;
    private String agencia;
    private String nomeBanco;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ClubeResponseVO(Long id, String nome, String cnpj, String contaCorrente, String agencia, String nomeBanco,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contaCorrente = contaCorrente;
        this.agencia = agencia;
        this.nomeBanco = nomeBanco;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
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
