package com.tbh.universidadproyect.comandos;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.Pabellon;
import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.models.enums.Pizarron;
import com.tbh.universidadproyect.services.contratos.AulaDAO;
import com.tbh.universidadproyect.services.contratos.CarreraDAO;
import com.tbh.universidadproyect.services.contratos.PabellonDAO;
import com.tbh.universidadproyect.services.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Order(5)
public class AulaCommand implements CommandLineRunner {
    @Autowired
    @Qualifier("aulaDAOImpl")
    private AulaDAO aulaDAO;
    @Autowired
    private PabellonDAO pabellonDAO;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------- ************ Aula Command ************ -----------");




        System.out.println("--- Busqueda de Aulas por Pizarron ---");

        Iterable<Aula> iAula = aulaDAO.findAulasByPizarron(ObjetosDummy.getAula123().getPizarron());
        iAula.forEach(System.out::println);

        System.out.println("--- Busqueda de Aulas por Nombre de Pabellon ---");

        Iterable<Aula> iAula2 = aulaDAO.findAulasByPabellonNombre(ObjetosDummy.getPabellonUno().getNombre());
        iAula.forEach(System.out::println);

        System.out.println("--- Busqueda de Aulas por Numero de Aula ---");

        Iterable<Aula> iAula3 = aulaDAO.findAulasByNroAula(ObjetosDummy.getAula123().getNroAula());

    }
}
