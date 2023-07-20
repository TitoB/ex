package com.tbh.universidadproyect.comandos;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.Empleado;
import com.tbh.universidadproyect.services.contratos.AulaDAO;
import com.tbh.universidadproyect.services.contratos.EmpleadoDAO;
import com.tbh.universidadproyect.services.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class EmpleadoCommand implements CommandLineRunner {
    @Autowired
    @Qualifier("empleadoDAOImpl")
    private EmpleadoDAO aulaDAO;
//    @Autowired
//    private PabellonDAO pabellonDAO;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------- ************ Empleado Command ************ -----------");

        //Iterable<Persona> findProfesoresByCarrera(String carrera)


        System.out.println("--- Busqueda de Aulas por Pizarron ---");

        //Iterable<Aula> iAula = aulaDAO.findAulasByPizarron(ObjetosDummy.getAula123().getPizarron());
        //iAula.forEach(System.out::println);
    }
}
