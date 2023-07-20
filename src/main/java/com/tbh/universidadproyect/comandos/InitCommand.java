package com.tbh.universidadproyect.comandos;

import com.tbh.universidadproyect.services.contratos.AulaDAO;
import com.tbh.universidadproyect.services.contratos.PabellonDAO;
import com.tbh.universidadproyect.services.contratos.PersonaDAO;
import com.tbh.universidadproyect.services.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitCommand {
    /*@Autowired
    @Qualifier(value = "alumnoDAOImpl")
    private PersonaDAO servicioAlumno;
    @Autowired
    @Qualifier(value = "empleadoDAOImpl")
    private PersonaDAO servicioEmpleado;
    @Autowired
    @Qualifier(value = "profesorDAOImpl")
    private PersonaDAO servicioProfesor;
    @Autowired
    @Qualifier(value = "aulaDAOImpl")
    private AulaDAO servicioAula;
    @Autowired
    @Qualifier(value = "pabellonDAOImpl")
    private PabellonDAO servicioPabellon;
    @Autowired
    @Qualifier(value = "carreraDAOImpl")
    private CarreraDAO servicioCarreras;*/
}
