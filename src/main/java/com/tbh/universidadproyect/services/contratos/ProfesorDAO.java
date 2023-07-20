package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Persona;

public interface ProfesorDAO extends PersonaDAO{
    Iterable<Persona> findProfesoresByCarrera(String carrera);
}
