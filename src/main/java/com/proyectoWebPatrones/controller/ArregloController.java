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
@RequestMapping("/arreglos")
public class ArregloController {
    @Autowired
    private ArregloService a;
    
    @GetMapping("/catalogo")
    public String inicio(Model model) {
        var arreglos = a.getArreglos(); 
        model.addAttribute("arreglos",arreglos);
        return "/arreglos/catalogo"; 
    }
    
    @GetMapping("/arreglo/agregar")
    public String nuevoArreglo(Arreglo arreglo){
        return "/arreglo/catalogo";
    }
    
    @PostMapping("/arreglo/catalogo")
    public String guardarArreglo(Arreglo arreglo){
        a.saveArreglo(arreglo);
        return "redirect:/arreglo/guardar";
    }
    
    @GetMapping("/arreglo/modificar/{idarreglo}")
    public String modificaArreglo(Arreglo arreglo, Model model) {
        arreglo = a.getArreglo(arreglo);
        model.addAttribute("arreglo", arreglo);
        return "/arreglo/catalogos";
    }
    
    @GetMapping("/arreglo/eliminar/{idarreglo}")
    public String eliminaArreglo(Arreglo arreglo) {
        a.deleteArreglo(arreglo);
        return "redirect:/arreglo/catalogo";
    }
    
}
