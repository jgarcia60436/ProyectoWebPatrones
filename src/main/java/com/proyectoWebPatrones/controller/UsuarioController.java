package com.proyectoWebPatrones.controller;

import com.proyectoWebPatrones.domain.Usuario;
import com.proyectoWebPatrones.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService uService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        var usuarios = uService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "/usuario/listado";
    }
    
    @GetMapping("/usuario/nuevo")
    public String nuevoCliente(Usuario usuario){
        return "/usuario/modifica";
    }
    
    @PostMapping("/usuario/guardar")
    public String guardarCliente(Usuario usuario){
        uService.saveUsuario(usuario);
        return "redirect:/usuario/listado";
    }
    
    @GetMapping("/usuario/modificar/{idusuario}")
    public String modificaCliente(Usuario usuario, Model model) {
        usuario = uService.getUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "/usuario/modifica";
    }
    
    @GetMapping("/usuario/eliminar/{idusuario}")
    public String eliminaUsuario(Usuario usuario) {
        uService.deleteUsuario(usuario);
        return "redirect:/usuario/listado";
    }
     
}
