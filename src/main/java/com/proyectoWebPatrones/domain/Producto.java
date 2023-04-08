package com.proyectoWebPatrones.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducto")
    private long idproducto;

    
    private String nombreProducto;
    private double precio;
    private String descripcion;
    private String cuidado;
    private String caracteristicas;
    private String imagen;

    public Producto() {
    }

    public Producto(String nombreProducto, double precio, String descripcion, String cuidado, String caracteristicas, String imagen) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cuidado = cuidado;
        this.caracteristicas = caracteristicas;
        this.imagen = imagen;
    }
    
}