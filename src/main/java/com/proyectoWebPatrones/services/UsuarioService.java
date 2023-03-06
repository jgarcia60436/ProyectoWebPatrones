package com.proyectoWebPatrones.services;

import java.util.List;
import com.proyectoWebPatrones.domain.Usuario;

public interface UsuarioService {

    public List<Usuario> getUsuarios();

    public Usuario getUsuario(Usuario usuario);

    public void deleteUsuario(Usuario usuario);

    public void saveUsuario(Usuario usuario);

}
