package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Persona;

import java.util.Optional;

public interface PersonaDAO extends GenericoDAO<Persona> {
/*    Optional<Persona> findBy(Integer id);
    Persona save(Persona persona);
    public Iterable<Persona> findAll();
    public void deleteById(Integer id);*/
    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
    Optional<Persona> buscarPorDni(String dni);
    Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
