package com.example.basicatransac_t04.repository;

import com.example.basicatransac_t04.entity.Funcionary;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionaryRepository extends JpaRepository<Funcionary, Integer> {
}
