package com.tbh.universidadproyect.repositories;

import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.models.Profesor;
import com.tbh.universidadproyect.repositories.PersonaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioProfesores")
public interface ProfesorRepository extends PersonaRepository {
    @Query("select p from Profesor p join fetch p.carreras c where c.nombre = ?1")
    Iterable<Persona> findProfesoresByCarrera(String carrera);
}
