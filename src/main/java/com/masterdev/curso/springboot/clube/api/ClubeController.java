package com.masterdev.curso.springboot.clube.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterdev.curso.springboot.clube.api.dto.ClubeRequestDTO;
import com.masterdev.curso.springboot.clube.api.dto.ClubeResponseDTO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeRequestVO;
import com.masterdev.curso.springboot.clube.business.bo.ClubeResponseVO;
import com.masterdev.curso.springboot.clube.converters.ClubeDTOConverter;
import com.masterdev.curso.springboot.clube.facade.ClubeFacade;

@RestController
@RequestMapping("/clubes")
public class ClubeController {
    private ClubeFacade clubeFacade;

    public ClubeController(ClubeFacade clubeFacade) {
        this.clubeFacade = clubeFacade;
    }


    @PostMapping
    public ClubeResponseDTO create(@RequestBody ClubeRequestDTO request ) {
        // converter de DTO para VO
        ClubeRequestVO requestVO = ClubeDTOConverter.fromDTOToVO(request);
        // chamar o facade para criar o clube no banco de dados atraves do business
        ClubeResponseVO response = clubeFacade.create(requestVO);
        // returna convertendo de VO para DTO
        return ClubeDTOConverter.fromVOToDTO(response);
    }
    
    @PutMapping("/{id}")
    public ClubeResponseDTO update( @RequestBody ClubeRequestDTO request, 
                                    @PathVariable("id") Long id ) {
        // converter de DTO para VO
        ClubeRequestVO requestVO = ClubeDTOConverter.fromDTOToVO(request);

        ClubeResponseVO response = clubeFacade.update(requestVO, id);
        
     
        return ClubeDTOConverter.fromVOToDTO(response);
    }

    @DeleteMapping("/{id}")
    public String delete( @PathVariable("id") Long id ) {
        clubeFacade.delete(id);
        return "Ok";
    }

    @GetMapping("/{id}")
    public Optional<ClubeResponseDTO> getById( @PathVariable("id") Long id ) {
        return clubeFacade.findById(id).map(ClubeDTOConverter::fromVOToDTO);
    }

    @GetMapping
    public List<ClubeResponseDTO> getAll() {
        List <ClubeResponseDTO> clubes = new ArrayList<>();

        List <ClubeResponseVO> clubesVO = clubeFacade.findAll();
        
        clubesVO.forEach(clube -> {
            clubes.add(ClubeDTOConverter.fromVOToDTO(clube));
        });
        
        return clubes;
    }
}
