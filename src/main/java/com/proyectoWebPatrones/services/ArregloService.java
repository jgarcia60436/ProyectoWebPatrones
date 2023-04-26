package com.proyectoWebPatrones.services;

import com.proyectoWebPatrones.domain.Arreglo;
import java.util.List;

public interface ArregloService {

    public List<Arreglo> getArreglos();

    public Arreglo getArreglo(Arreglo arreglo);

    public void deleteArreglo(Arreglo arreglo);

    public void saveArreglo(Arreglo arreglo);
}
