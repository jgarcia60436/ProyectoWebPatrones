/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoWebPatrones.controller;

import com.proyectoWebPatrones.domain.Producto;
import com.proyectoWebPatrones.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService ps;
    
    @GetMapping("/catalogo")
    public String inicio(Model model) {
        var productos = ps.getProductos(); 
        model.addAttribute("productos",productos);
        return "/productos/catalogo"; 
    }
}
