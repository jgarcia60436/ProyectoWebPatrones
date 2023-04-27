package com.proyectoWebPatrones.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
    private long idProducto;

    
    private String nombreproducto;
    private double precio;
    private String descripcion;
    private String cuidado;
    private String caracteristicas;
    private String imagen;
    private String resenna;

    public Producto() {
    }

    public Producto(String nombreproducto, double precio, String descripcion, String cuidado, String caracteristicas, String imagen, String resenna) {
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cuidado = cuidado;
        this.caracteristicas = caracteristicas;
        this.imagen = imagen;
        this.resenna = resenna;
    }

}
