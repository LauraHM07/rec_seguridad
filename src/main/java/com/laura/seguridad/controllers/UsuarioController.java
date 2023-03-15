package com.laura.seguridad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.laura.seguridad.models.Usuario;
import com.laura.seguridad.services.UsuarioService;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService service;

    @RequestMapping("/buscar")
    Usuario findByusername(@RequestParam String username, @RequestParam String password) {
        return service.findByusername(username, password);
    }
}
