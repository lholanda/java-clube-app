package com.masterdev.curso.springboot.clube.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masterdev.curso.springboot.clube.business.bo.ClubeRequestVO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeResponseVO;
import com.masterdev.curso.springboot.clube.converters.ClubeEntityConverter;
import com.masterdev.curso.springboot.clube.model.entity.Clube;
import com.masterdev.curso.springboot.clube.model.repository.ClubeRepository;

@Service
public class ClubeDAO {

    private ClubeRepository clubeRepository;

    public ClubeDAO(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }

    public ClubeResponseVO create( ClubeRequestVO request ) {
        Clube clube = ClubeEntityConverter.fromVOToEntityNew(request);

        System.out.println("ClubeDAO "+clube.getCreatedAt());

        clube = clubeRepository.save(clube);

        return ClubeEntityConverter.fromEntityToVO(clube);
    }

    public ClubeResponseVO update ( ClubeRequestVO request , Long id) {
        // busca o clube pelo id, melhor forma de fazer update
        // assume que existe o clube... diferente do findById que retorna um Optional
        Clube clubeExistent = clubeRepository.getReferenceById(id);
        ClubeEntityConverter.fromVOToEntityExistent( clubeExistent, request);
        
        clubeRepository.save(clubeExistent);

        return ClubeEntityConverter.fromEntityToVO(clubeExistent);
    }

    
    public Optional<ClubeResponseVO> findById( Long id ) {

        Optional<Clube> optionalClube = clubeRepository.findById(id);


        return optionalClube.map(ClubeEntityConverter::fromEntityToVO);
    }
    
    public List<ClubeResponseVO> findAll() {
        List<Clube> clubes = clubeRepository.findAll();
        // testar stream
        return clubes.stream().map(ClubeEntityConverter::fromEntityToVO).toList();
    }
    
    public void delete( Long id ) {
        clubeRepository.deleteById(id);
    }
}
