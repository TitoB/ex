package com.tbh.universidadproyect.repositories;

import com.tbh.universidadproyect.models.Empleado;
import com.tbh.universidadproyect.models.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioEmpleados")
public interface EmpleadoRepository extends PersonaRepository {
    @Query("select e from Empleado e where e.tipoEmpleado = ?1")
    Iterable<Persona> findEmpleadoByTipoEmpleado(Empleado tipoEmpleado);
}
