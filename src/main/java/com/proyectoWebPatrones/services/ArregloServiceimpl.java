package com.proyectoWebPatrones.services;

import com.proyectoWebPatrones.dao.ArregloDao;
import com.proyectoWebPatrones.domain.Arreglo;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ArregloServiceimpl implements ArregloService{
    
    @Autowired
    private ArregloDao arregloDao;

    @Override
    public List<Arreglo> getArreglos() {
        return (List<Arreglo>) arregloDao.findAll();
    }

    @Override
    public Arreglo getArreglo(Arreglo arreglo) {
        return arregloDao.findById(arreglo.getIdarreglo()).orElse(null);
    }

    @Override
    public void deleteArreglo(Arreglo arreglo) {
        arregloDao.delete(arreglo);
    }

    @Override
    public void saveArreglo(Arreglo arreglo) {
        arregloDao.save(arreglo);
    }
}
