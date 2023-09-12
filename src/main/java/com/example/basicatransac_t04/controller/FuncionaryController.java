package com.example.basicatransac_t04.controller;

import com.example.basicatransac_t04.dto.ResponseDTO;
import com.example.basicatransac_t04.entity.Funcionary;
import com.example.basicatransac_t04.service.FuncionaryService;
/**import org.springframework.security.access.prepost.PreAuthorize;**/
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FuncionaryController {
    private final FuncionaryService funcionaryService;

    public FuncionaryController(FuncionaryService funcionaryService) {
        this.funcionaryService = funcionaryService;
    }

    @PostMapping("/create")
    /**@PreAuthorize("hasRole('ADMIN')")**/
    public Funcionary create(@RequestBody Funcionary funcionary){
        return funcionaryService.create(funcionary);
    }

    @GetMapping("/{id}")
    public ResponseDTO getFuncionaryById(@PathVariable Integer id){
        return funcionaryService.getFuncionaryById(id);
    }

    @GetMapping("/list")
    /**@PreAuthorize("hasAnyRole('ADMIN', 'FUNCIONARIO')")**/
    public List<Funcionary> findAll(){
        return funcionaryService.findAll();
    }
}