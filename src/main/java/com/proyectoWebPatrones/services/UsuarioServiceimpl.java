package com.proyectoWebPatrones.services;

import com.proyectoWebPatrones.dao.UsuarioDao;
import com.proyectoWebPatrones.domain.Usuario;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoWebPatrones.domain.Usuario;

@Service
public class UsuarioServiceimpl implements UsuarioService{
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @Override
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdusuario()).orElse(null);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }
    
}
