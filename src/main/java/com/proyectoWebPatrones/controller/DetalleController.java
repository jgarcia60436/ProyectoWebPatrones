/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoWebPatrones.controller;

import com.proyectoWebPatrones.domain.Detalle;
import com.proyectoWebPatrones.services.DetalleService;
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
    private DetalleService a;
    
    @GetMapping("/catalogoArreglosYDetalles")
    public String inicio(Model model) {
        var detalles = a.getDetalles(); 
        model.addAttribute("detalles",detalles);
        return "/detalles/catalogoArreglosYDetalles"; 
    }
    
    @GetMapping("/detalle/agregar")
    public String nuevoDetalle(Detalle detalle){
        return "/detalle/catalogoArreglosYDetalles";
    }
    
    @PostMapping("/detalle/catalogoArreglosYDetalles")
    public String guardarDetalle(Detalle detalle){
        a.saveDetalle(detalle);
        return "redirect:/detalle/guardar";
    }
    
    @GetMapping("/detalle/modificar/{iddetalle}")
    public String modificaDetalle(Detalle detalle, Model model) {
        detalle = a.getDetalle(detalle);
        model.addAttribute("detalle", detalle);
        return "/detalle/catalogoArreglosYDetalless";
    }
    
    @GetMapping("/detalle/eliminar/{iddetalle}")
    public String eliminaDetalle(Detalle detalle) {
        a.deleteDetalle(detalle);
        return "redirect:/detalle/catalogoArreglosYDetalles";
    }
    
}
