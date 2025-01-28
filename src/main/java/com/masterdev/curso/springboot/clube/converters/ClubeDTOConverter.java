package com.masterdev.curso.springboot.clube.converters;

import com.masterdev.curso.springboot.clube.api.dto.ClubeRequestDTO;
import com.masterdev.curso.springboot.clube.api.dto.ClubeResponseDTO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeRequestVO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeResponseVO;

public class ClubeDTOConverter{

    public static ClubeRequestVO fromDTOToVO(ClubeRequestDTO request) {


        return new ClubeRequestVO(
                request.getId(),
                request.getNome(),
                request.getCnpj(),
                request.getContaCorrente(),
                request.getAgencia(),
                request.getNomeBanco());
    }

    public static ClubeResponseDTO fromVOToDTO(ClubeResponseVO response) {
        
        return new ClubeResponseDTO(
                response.getId(),
                response.getNome(),
                response.getCnpj(),
                response.getContaCorrente(),
                response.getAgencia(),
                response.getNomeBanco(),
                response.getCreatedAt(),
                response.getUpdatedAt());
    }
}
