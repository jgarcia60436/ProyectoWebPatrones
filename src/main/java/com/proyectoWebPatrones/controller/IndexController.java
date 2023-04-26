package com.proyectoWebPatrones.controller;

import com.proyectoWebPatrones.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private ProductoService ps;

    @GetMapping("/")
    public String inicio(Model model) {
        var productos = ps.getProductos(); 
        model.addAttribute("productos",productos);
        return "/index"; 
    }
}

