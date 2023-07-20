package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.Carrera;
import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.models.enums.Pizarron;

import java.util.Optional;

public interface AlumnoDAO extends PersonaDAO{
    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);
}
