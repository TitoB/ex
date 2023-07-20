package com.tbh.universidadproyect.services.implementaciones;

import com.tbh.universidadproyect.models.Empleado;
import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.repositories.EmpleadoRepository;
import com.tbh.universidadproyect.repositories.PersonaRepository;
import com.tbh.universidadproyect.services.contratos.AlumnoDAO;
import com.tbh.universidadproyect.services.contratos.EmpleadoDAO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpleadoDAOImpl extends GenericoDAOImp<Persona, PersonaRepository>
        implements EmpleadoDAO {
    public EmpleadoDAOImpl(EmpleadoRepository repository) {
        super(repository);
    }


    @Override
    public Iterable<Persona> findEmpleadoByTipoEmpleado(Empleado tipoEmpleado) {
        return null;
    }

    @Override
    public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
        return Optional.empty();
    }

    @Override
    public Optional<Persona> buscarPorDni(String dni) {
        return Optional.empty();
    }

    @Override
    public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
        return null;
    }
}
