package com.tbh.universidadproyect.repositories;

import com.tbh.universidadproyect.models.Pabellon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PabellonRepository extends CrudRepository<Pabellon, Integer> {
    @Query("select p from pabellones p where p.direccion.localidad = ?1")
    Iterable<Pabellon> findPabellonByLocalidad(String localidad);
    @Query("Select  p from pabellones p where p.nombre=?1")
    Iterable<Pabellon> findPabellonByNombre(String nombre);

}
