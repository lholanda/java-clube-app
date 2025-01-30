package com.masterdev.curso.springboot.jogador.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterdev.curso.springboot.jogador.business.bo.JogadorRequestVO;
import com.masterdev.curso.springboot.jogador.business.bo.JogadorResponseVO;
import com.masterdev.curso.springboot.jogador.converters.JogadorEntityConverter;
import com.masterdev.curso.springboot.jogador.model.entity.Jogador;
import com.masterdev.curso.springboot.jogador.model.repository.JogadorRepository;

@Service
public class JogadorDAO {
    @Autowired
    private JogadorRepository jogadorRepository;

    // implementacao dos metodos CRUD para Jogador
    public JogadorResponseVO create (JogadorRequestVO request){
        Jogador jogador = JogadorEntityConverter.fromVOToEntityNew(request);
        // persistir o jogador no banco de dados
        jogador = jogadorRepository.save(jogador);
        
        return JogadorEntityConverter.fromEntityToVO(jogador);
    }

    public JogadorResponseVO update (JogadorRequestVO request, Long id){
        Jogador jogadorExistent = jogadorRepository.getReferenceById(id);
        JogadorEntityConverter.fromVOToEntityExistent(request, jogadorExistent);

        // persistir o jogador no banco de dados
        jogadorRepository.save(jogadorExistent);

        return JogadorEntityConverter.fromEntityToVO(jogadorExistent);
    }
    
    public Optional<JogadorResponseVO> findById (Long id){
        Optional<Jogador> optionalJogador = jogadorRepository.findById(id);

        return optionalJogador.map(JogadorEntityConverter::fromEntityToVO);

        
    }
    
    public List<JogadorResponseVO> findAll(){
        List<Jogador> jogadores = jogadorRepository.findAll();
        
        return jogadores.stream().map(JogadorEntityConverter::fromEntityToVO).toList();
    }

    public void deleteById (Long id){
        jogadorRepository.deleteById(id);
    }





}


// if(optionalJogador.isPresent()){
//     return Optional.of(JogadorEntityConverter.fromEntityToVO(optionalJogador.get()));
// } 
// return Optional.empty();
