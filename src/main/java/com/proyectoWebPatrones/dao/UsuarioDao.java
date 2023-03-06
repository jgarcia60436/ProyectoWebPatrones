package com.proyectoWebPatrones.dao;

import com.proyectoWebPatrones.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

}
