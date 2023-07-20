package com.tbh.universidadproyect.repositories;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.enums.Pizarron;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioAulas")
public interface AulaRepository extends CrudRepository<Aula, Integer> {
    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellonNombre(String nombre);
    Iterable<Aula> findAulasByNroAula(Integer nroAula);
}
