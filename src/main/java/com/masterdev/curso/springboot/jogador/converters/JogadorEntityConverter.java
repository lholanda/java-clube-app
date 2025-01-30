package com.masterdev.curso.springboot.jogador.converters;

import com.masterdev.curso.springboot.jogador.business.bo.JogadorRequestVO;
import com.masterdev.curso.springboot.jogador.business.bo.JogadorResponseVO;
import com.masterdev.curso.springboot.jogador.model.entity.Jogador;

public class JogadorEntityConverter {
    public static Jogador fromVOToEntityNew(JogadorRequestVO request) {
        return new Jogador(
                null,
                request.getNome(),
                request.getRg(),
                request.getCpf(),
                request.getNacionalidade(),
                request.getDataNascimento(),
                request.getPosicao(),
                request.getPeso(),
                request.getAltura()
        ); 
    }

    public static void fromVOToEntityExistent(JogadorRequestVO request, Jogador jogador) {
        jogador.setNome(request.getNome());
        jogador.setRg(request.getRg());
        jogador.setCpf(request.getCpf());
        jogador.setNacionalidade(request.getNacionalidade());
        jogador.setDataNascimento(request.getDataNascimento());
        jogador.setPosicao(request.getPosicao());
        jogador.setPeso(request.getPeso());
        jogador.setAltura(request.getAltura());
    }

    public static JogadorResponseVO fromEntityToVO(Jogador jogador) {
        return new JogadorResponseVO(
                jogador.getId(),
                jogador.getNome(),
                jogador.getRg(),
                jogador.getCpf(),
                jogador.getNacionalidade(),
                jogador.getDataNascimento(),
                jogador.getPosicao(),
                jogador.getPeso(),
                jogador.getAltura(),

                jogador.getCreatedAt(),
                jogador.getUpdatedAt()
        );  
    }
};
    
