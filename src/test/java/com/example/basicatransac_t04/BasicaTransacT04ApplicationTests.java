package com.example.basicatransac_t04;

import com.example.basicatransac_t04.entity.Usuario;
import com.example.basicatransac_t04.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class BasicaTransacT04ApplicationTests {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void creaUsuarios() {
        Usuario us = new Usuario();
        us.setName("andre");
        us.setPassword(bCryptPasswordEncoder.encode("123456"));
        Usuario retorno = usuarioRepository.save(us);
        assert(retorno.getPassword().equals(us.getPassword()));
    }

}
