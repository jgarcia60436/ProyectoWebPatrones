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
@Table(name = "arreglos")
public class Arreglo {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idarreglo")
    private long idarreglo;

    private String nombreproducto;
    private double precio;
    private String imagen;

    public Arreglo() {
    }
    
    public Arreglo(String nombreproducto, double precio, String imagen) {
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.imagen = imagen;
    }
}
