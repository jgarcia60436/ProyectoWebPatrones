package com.proyectoWebPatrones.services;

import com.proyectoWebPatrones.domain.Detalle;
import java.util.List;

public interface DetalleService {

    public List<Detalle> getDetalles();

    public Detalle getDetalle(Detalle detalle);

    public void deleteDetalle(Detalle detalle);

    public void saveDetalle(Detalle detalle);
}
