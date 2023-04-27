package com.proyectoWebPatrones.domain;

import lombok.Data;

@Data
public class Item extends Producto {
    private int cantidad; //Almacenar la cantidad de items de un producto

    public Item() {
    }

    public Item(Producto producto) {
        super.setIdProducto(producto.getIdProducto());
        //super.setCategoria(producto.getCategoria());//---- hacer categoria-- credito
        super.setNombreproducto(producto.getNombreproducto());
        super.setDescripcion(producto.getDescripcion());
        super.setPrecio(producto.getPrecio());
        super.setCuidado(producto.getCuidado());
        super.setCaracteristicas(producto.getCaracteristicas());
        super.setImagen(producto.getImagen());
        this.cantidad = 0;
    }

}
