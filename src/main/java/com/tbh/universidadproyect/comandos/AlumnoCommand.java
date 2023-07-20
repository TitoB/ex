package com.tbh.universidadproyect.comandos;

import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.services.contratos.CarreraDAO;
import com.tbh.universidadproyect.services.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Order(6)
public class AlumnoCommand implements CommandLineRunner {
    @Autowired
    @Qualifier("alumnoDAOImpl")
    private PersonaDAO personaDAO;
    @Autowired
    private CarreraDAO carreraDao;
    public void run(String... args) throws Exception {
        System.out.println("------- ************ Alumnos Command ************ -----------");

        System.out.println("--- Busqueda de Personas por Apellido ---");

        Iterable<Persona> iPersona = personaDAO.buscarPersonaPorApellido(ObjetosDummy.getAlumnoDos().getApellido());
        iPersona.forEach(System.out::println);

        System.out.println("---- Busqueda de Persona por Dni ----");
        Optional<Persona> oPersona = personaDAO.buscarPorDni
                (ObjetosDummy.getEmpleadoUno().getDni());

        /*if(oPersona.isPresent()){
            System.out.println(oPersona.get().toString());
        }
        System.out.println("--- Busqueda por Persona por Nombre y Apellido ---");
        Optional<Persona> oPersonaDos = personaDAO.buscarPorNombreYApellido(
                ObjetosDummy.getProfesorDos().getNombre(),
                ObjetosDummy.getProfesorDos().getApellido());
        if(oPersona.isPresent()){
            System.out.println(oPersonaDos.get().toString());
        }

        System.out.println("---- Busqueda por Persona Por Carrera ----");
        Iterable<Persona> iAlumnos = ((AlumnoDAO) personaDAO)
                .buscarAlumnosPorNombreCarrera(ObjetosDummy.getCarreraIngSis().getNombre());
        iAlumnos.forEach(System.out::println);

        Optional<Carrera> ingSistemas = carreraDao.findById(2);

        Iterable<Persona> alumnos = personaDAO.findAll();
        alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(ingSistemas.get()));
        alumnos.forEach(alumno -> personaDAO.save(alumno));

        Optional<Persona> alumno_1 = personaDAO.findById(1);
        Optional<Persona> personaNomApe = personaDAO.buscarPorNombreYApellido
                (alumno_1.get().getNombre(), alumno_1.get().getApellido());
        System.out.println(personaNomApe.toString());

        Optional<Persona> personaDni = personaDAO.buscarPorDni(alumno_1.get().getDni());
        System.out.println(personaDni.toString());

        Iterable<Persona> personasApellido = personaDAO.buscarPersonaPorApellido(alumno_1.get().getApellido());
        personasApellido.forEach(System.out::println);

        Optional<Carrera> ingSistema = carreraDao.findById(2);
        Iterable<Persona> alumnosCarrera = ((AlumnoDAO) personaDAO).buscarAlumnosPorNombreCarrera(ingSistema.get().getNombre());
        alumnosCarrera.forEach(System.out::println);*/
    }
}
