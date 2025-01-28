package com.masterdev.curso.springboot.clube.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masterdev.curso.springboot.clube.business.ClubeBusiness;
import com.masterdev.curso.springboot.clube.business.bo.ClubeRequestVO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeResponseVO;

@Service
public class ClubeFacade {
    private ClubeBusiness clubeBusiness;

    public ClubeFacade(ClubeBusiness clubeBusiness) {
        this.clubeBusiness = clubeBusiness;
    }

    public ClubeResponseVO create(ClubeRequestVO request) {
        return clubeBusiness.create(request);
    }

    public ClubeResponseVO update(ClubeRequestVO request, Long Id) {
        return clubeBusiness.update(request, Id);
    }

    
    public Optional<ClubeResponseVO> findById(Long id) {
        return clubeBusiness.findById(id);
    }
    
    public List<ClubeResponseVO> findAll() {
        return clubeBusiness.findAll();
    }
    
    public void delete(Long id) {
        clubeBusiness.deleteById(id);
    }
}
