package com.example.basicatransac_t04.service;

import com.example.basicatransac_t04.dto.ResponseDTO;
import com.example.basicatransac_t04.dto.TeenDTO;
import com.example.basicatransac_t04.entity.Funcionary;
import com.example.basicatransac_t04.repository.FuncionaryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FuncionaryService {
    private final FuncionaryRepository funcionaryRepository;
    private final RestTemplate restTemplate;

    public FuncionaryService(FuncionaryRepository funcionaryRepository, RestTemplate restTemplate) {
        this.funcionaryRepository = funcionaryRepository;
        this.restTemplate = restTemplate;
    }
    public Funcionary create(Funcionary funcionary){
        return funcionaryRepository.save(funcionary);
    }

    public ResponseDTO getFuncionaryById(Integer id ){
        Funcionary funcionary = new Funcionary();
        ResponseDTO responseDTO = new ResponseDTO();
        funcionary = funcionaryRepository.findById(id).get();
        ResponseEntity<TeenDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/teen/"+ funcionary.getId_adolescente(), TeenDTO.class);
        TeenDTO teenDTO = responseEntity.getBody();
        responseDTO.setFuncionary(funcionary);
        responseDTO.setTeenDTO(teenDTO);

        return responseDTO;
    }
    public List<Funcionary> findAll(){
        return funcionaryRepository.findAll();
    }

}
