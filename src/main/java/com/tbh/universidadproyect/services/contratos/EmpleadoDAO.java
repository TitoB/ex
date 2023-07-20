package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Empleado;
import com.tbh.universidadproyect.models.Persona;

public interface EmpleadoDAO extends PersonaDAO {
    Iterable<Persona> findEmpleadoByTipoEmpleado(Empleado tipoEmpleado);
}
