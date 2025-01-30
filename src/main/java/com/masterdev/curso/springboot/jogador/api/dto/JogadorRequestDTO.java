package com.masterdev.curso.springboot.jogador.api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.masterdev.curso.springboot.jogador.type.PosicaoJogador;

public class JogadorRequestDTO {
    private Long id;
    private String nome;
    private String rg;
    private String cpf;
    private String nacionalidade;
    private LocalDateTime dataNascimento;
    private PosicaoJogador posicao;
    private BigDecimal peso;
    private BigDecimal altura;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
