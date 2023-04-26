package com.proyectoWebPatrones.services;

import com.proyectoWebPatrones.dao.DetalleDao;
import com.proyectoWebPatrones.domain.Detalle;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DetalleServiceimpl implements DetalleService{
    
    @Autowired
    private DetalleDao detalleDao;

    @Override
    public List<Detalle> getDetalles() {
        return (List<Detalle>) detalleDao.findAll();
    }

    @Override
    public Detalle getDetalle(Detalle detalle) {
        return detalleDao.findById(detalle.getIddetalle()).orElse(null);
    }

    @Override
    public void deleteDetalle(Detalle detalle) {
        detalleDao.delete(detalle);
    }

    @Override
    public void saveDetalle(Detalle detalle) {
        detalleDao.save(detalle);
    }
}
