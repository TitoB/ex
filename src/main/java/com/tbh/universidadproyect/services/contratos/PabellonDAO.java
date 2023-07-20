package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.Direccion;
import com.tbh.universidadproyect.models.Pabellon;
import com.tbh.universidadproyect.models.enums.Pizarron;

public interface PabellonDAO extends GenericoDAO<Pabellon>{
    Iterable<Pabellon> findPabellonByLocalidad(String localidad);
    Iterable<Pabellon> findPabellonByNombre(String nombre);
}
