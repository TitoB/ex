package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Carrera;

public interface CarreraDAO extends GenericoDAO<Carrera>{
    Iterable<Carrera> findCarrerasByNombreContains(String nombre);
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);
}
