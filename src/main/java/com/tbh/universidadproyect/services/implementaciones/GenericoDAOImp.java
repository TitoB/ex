package com.tbh.universidadproyect.services.implementaciones;

import com.tbh.universidadproyect.repositories.PersonaRepository;
import com.tbh.universidadproyect.services.contratos.GenericoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class GenericoDAOImp <E, R extends CrudRepository<E,Integer>>
        implements GenericoDAO<E> {
    protected final R repository;
    public GenericoDAOImp( R repository) {
        this.repository = repository;
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public E save(E entidad) {
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
