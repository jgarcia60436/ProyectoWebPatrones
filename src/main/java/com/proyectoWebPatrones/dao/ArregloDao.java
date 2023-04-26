/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoWebPatrones.dao;

import com.proyectoWebPatrones.domain.Arreglo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArregloDao extends JpaRepository<Arreglo, Long> {
    
}
