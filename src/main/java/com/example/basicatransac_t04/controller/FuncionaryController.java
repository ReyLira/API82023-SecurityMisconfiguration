package com.example.basicatransac_t04.controller;


import com.example.basicatransac_t04.dto.ResponseDTO;
import com.example.basicatransac_t04.entity.Funcionary;
import com.example.basicatransac_t04.service.FuncionaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionary")
public class FuncionaryController {
    private final FuncionaryService funcionaryService;

    public FuncionaryController(FuncionaryService funcionaryService) {
        this.funcionaryService = funcionaryService;
    }

    @PostMapping
    public Funcionary create(@RequestBody Funcionary funcionary){
        return funcionaryService.create(funcionary);
    }

    @GetMapping("/{id}")
    public ResponseDTO getTeenById(@PathVariable Integer id){
        return funcionaryService.getFuncionaryById(id);
    }

    @GetMapping
    public List<Funcionary> findAll(){
        return funcionaryService.findAll();
    }


}
