package com.tbh.universidadproyect.services.contratos;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.enums.Pizarron;
import org.springframework.stereotype.Service;

public interface AulaDAO extends GenericoDAO <Aula> {
    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellonNombre(String nombre);
    Iterable<Aula> findAulasByNroAula(Integer nroAula);
}
