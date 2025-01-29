package com.masterdev.curso.springboot.jogador.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masterdev.curso.springboot.clube.api.dto.ClubeRequestDTO;
import com.masterdev.curso.springboot.clube.api.dto.ClubeResponseDTO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeRequestVO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeResponseVO;
import com.masterdev.curso.springboot.clube.converters.ClubeDTOConverter;
import com.masterdev.curso.springboot.jogador.api.dto.JogadorRequestDTO;
import com.masterdev.curso.springboot.jogador.api.dto.JogadorResponseDTO;

@RestController
public class JogadorController {
    

    @PostMapping
    public JogadorResponseDTO create(@RequestBody JogadorRequestDTO request ) {
        // converter de DTO para VO
        ClubeRequestVO requestVO = ClubeDTOConverter.fromDTOToVO(request);
        // chamar o facade para criar o clube no banco de dados atraves do business
        ClubeResponseVO response = clubeFacade.create(requestVO);
        // returna convertendo de VO para DTO
        return ClubeDTOConverter.fromVOToDTO(response);
    }

}
