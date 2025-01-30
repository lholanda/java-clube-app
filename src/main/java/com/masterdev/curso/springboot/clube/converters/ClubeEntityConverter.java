package com.masterdev.curso.springboot.clube.converters;

import com.masterdev.curso.springboot.clube.business.bo.ClubeRequestVO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeResponseVO;
import com.masterdev.curso.springboot.clube.model.entity.Clube;

public class ClubeEntityConverter {

    public static Clube fromVOToEntityNew(ClubeRequestVO request) {
        return new Clube(
                null,
                request.getNome(),
                request.getCnpj(),
                request.getContaCorrente(),
                request.getAgencia(),
                request.getNomeBanco());
    }

    public static void fromVOToEntityExistent(Clube clube, ClubeRequestVO request) {
        clube.setNome(request.getNome());
        clube.setCnpj(request.getCnpj());
        clube.setContaCorrente(request.getContaCorrente());
        clube.setAgencia(request.getAgencia());
        clube.setNomeBanco(request.getNomeBanco());
    }

    public static ClubeResponseVO fromEntityToVO(Clube clube) {
        return new ClubeResponseVO(
                clube.getId(),
                clube.getNome(),
                clube.getCnpj(),
                clube.getContaCorrente(),
                clube.getAgencia(),
                clube.getNomeBanco(),
                
                clube.getCreatedAt(),
                clube.getUpdatedAt());
    }

}
