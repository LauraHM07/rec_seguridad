package com.laura.seguridad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.laura.seguridad.services.UsuarioService;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService service;
}
