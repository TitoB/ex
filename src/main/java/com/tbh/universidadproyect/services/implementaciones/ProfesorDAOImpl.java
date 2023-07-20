package com.tbh.universidadproyect.services.implementaciones;

import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.models.Profesor;
import com.tbh.universidadproyect.repositories.PersonaRepository;
import com.tbh.universidadproyect.repositories.ProfesorRepository;
import com.tbh.universidadproyect.services.contratos.PabellonDAO;
import com.tbh.universidadproyect.services.contratos.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProfesorDAOImpl extends GenericoDAOImp<Persona, PersonaRepository> implements ProfesorDAO {

    @Autowired
    public ProfesorDAOImpl(@Qualifier("repositorioProfesores")PersonaRepository repository) {
        super(repository);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
        return repository.buscarPorNombreYApellido(nombre, apellido);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorDni(String dni) {
        return repository.buscarPorDni(dni);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
        return repository.buscarPersonaPorApellido(apellido);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findProfesoresByCarrera(String carrera) {
        return findProfesoresByCarrera(carrera);
    }
}


