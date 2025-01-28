package com.masterdev.curso.springboot.clube.business;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masterdev.curso.springboot.clube.business.bo.ClubeRequestVO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeResponseVO;
import com.masterdev.curso.springboot.clube.dao.ClubeDAO;

@Service
public class ClubeBusiness {

    private ClubeDAO clubeDAO;
    // constructor injection (the best) - https://www.baeldung.com/constructor-injection-in-spring
    public ClubeBusiness(ClubeDAO clubeDAO) {
        this.clubeDAO = clubeDAO;
    }

    public ClubeResponseVO create(ClubeRequestVO request) {
        // validacoes de negocio - será abordao em breve modulo 9
        return clubeDAO.create(request);
    }

    public ClubeResponseVO update(ClubeRequestVO request, Long id) {
        // validacoes de negocio- será abordao em breve modulo 9
        return clubeDAO.update(request, id);
    }

    
    public Optional<ClubeResponseVO> findById(Long id) {
        return clubeDAO.findById(id);
    }
    
    public List<ClubeResponseVO> findAll() {
        return clubeDAO.findAll();
    }
    
    public void deleteById(Long id) {
        clubeDAO.delete(id);
    }
}
