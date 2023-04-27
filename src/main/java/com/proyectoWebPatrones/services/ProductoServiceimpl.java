package com.proyectoWebPatrones.services;

import com.proyectoWebPatrones.dao.ProductoDao;
import com.proyectoWebPatrones.domain.Producto;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductoServiceimpl implements ProductoService{
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> getProductos() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public void deleteProducto(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    public void saveProducto(Producto producto) {
        productoDao.save(producto);
    }
}
