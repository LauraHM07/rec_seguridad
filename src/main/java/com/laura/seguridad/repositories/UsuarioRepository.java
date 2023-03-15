package com.laura.seguridad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laura.seguridad.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    
}
