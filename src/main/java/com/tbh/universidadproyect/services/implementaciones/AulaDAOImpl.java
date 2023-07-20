package com.tbh.universidadproyect.services.implementaciones;

import com.tbh.universidadproyect.models.Aula;
import com.tbh.universidadproyect.models.enums.Pizarron;
import com.tbh.universidadproyect.repositories.AulaRepository;
import com.tbh.universidadproyect.services.contratos.AulaDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AulaDAOImpl extends GenericoDAOImp<Aula, AulaRepository>
implements AulaDAO {
    public AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByPizarron(Pizarron pizarron) {
        return repository.findAulasByPizarron(pizarron);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByPabellonNombre(String nombre) {
        return repository.findAulasByPabellonNombre(nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByNroAula(Integer nroAula) {
        return repository.findAulasByNroAula(nroAula);
    }
}
