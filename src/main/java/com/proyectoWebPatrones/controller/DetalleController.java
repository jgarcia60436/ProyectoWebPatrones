/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoWebPatrones.controller;

import com.proyectoWebPatrones.domain.Arreglo;
import com.proyectoWebPatrones.services.ArregloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/detalles")
public class DetalleController {
    @Autowired
    private ArregloService a;
    
    @GetMapping("/catalogo")
    public String inicio(Model model) {
        var detalles = a.getArreglos(); 
        model.addAttribute("detalles",detalles);
        return "/arreglos/catalogo"; 
    }
    
    @GetMapping("/detalle/agregar")
    public String nuevoArreglo(Arreglo detalle){
        return "/arreglos/catalogo";
    }
    
    @PostMapping("/detalle/catalogo")
    public String guardarArreglo(Arreglo detalle){
        a.saveArreglo(detalle);
        return "redirect:/arreglos/guardar";
    }
    
    @GetMapping("/arreglos/modificar/{iddetalle}")
    public String modificaArreglo(Arreglo detalle, Model model) {
        detalle = a.getArreglo(detalle);
        model.addAttribute("detalle", detalle);
        return "/arreglos/catalogos";
    }
    
    @GetMapping("/detalle/eliminar/{iddetalle}")
    public String eliminaArreglo(Arreglo detalle) {
        a.deleteArreglo(detalle);
        return "redirect:/arreglos/catalogo";
    }
    
}
