package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Carrera;

import java.util.Optional;

public interface GenericoDAO <E>{
    Optional<E> findById(Integer id);
    E save(E entidad);
    public Iterable<E> findAll();
    public void deleteById(Integer id);
}
