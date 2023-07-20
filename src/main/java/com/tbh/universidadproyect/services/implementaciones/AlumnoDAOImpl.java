package com.tbh.universidadproyect.services.implementaciones;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.models.enums.Pizarron;
import com.tbh.universidadproyect.repositories.PersonaRepository;
import com.tbh.universidadproyect.services.contratos.AlumnoDAO;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoDAOImpl extends GenericoDAOImp<Persona, PersonaRepository>
        implements AlumnoDAO {
    @Autowired
    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos") PersonaRepository repository){
        super(repository);
    }

    @Override
    public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
        return repository.buscarPorNombreYApellido(nombre, apellido);
    }

    @Override
    public Optional<Persona> buscarPorDni(String dni) {
        return repository.buscarPorDni(dni);
    }

    @Override
    public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
        return repository.buscarPersonaPorApellido(apellido);
    }

    @Override
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre) {
        return buscarAlumnosPorNombreCarrera(nombre);
    }

}
