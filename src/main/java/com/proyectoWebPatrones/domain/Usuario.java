package com.proyectoWebPatrones.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;
    
    private String correo;
    private String conteasenna;

    public Usuario() {
        
    }

    public Usuario(String correo, String conteasenna) {
        this.correo = correo;
        this.conteasenna = conteasenna;
    }
    
}
