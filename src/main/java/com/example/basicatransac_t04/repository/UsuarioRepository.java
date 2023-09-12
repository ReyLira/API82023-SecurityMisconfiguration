/**package com.example.basicatransac_t04.repository;

import com.example.basicatransac_t04.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByName(String name);
}**/
