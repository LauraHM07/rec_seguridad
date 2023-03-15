package com.laura.seguridad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.seguridad.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;
}
