package com.laura.seguridad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.seguridad.models.Usuario;
import com.laura.seguridad.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;

    public Usuario findByusername(String username, String password) {
        return repository.findByNameAndPassword(username, password);
    }
}
