package com.tbh.universidadproyect.services.implementaciones;

import com.tbh.universidadproyect.models.Pabellon;
import com.tbh.universidadproyect.repositories.PabellonRepository;
import com.tbh.universidadproyect.services.contratos.PabellonDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PabellonDAOImpl extends GenericoDAOImp<Pabellon, PabellonRepository>
implements PabellonDAO {
    public PabellonDAOImpl(PabellonRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Pabellon> findPabellonByLocalidad(String localidad) {
        return findPabellonByLocalidad(localidad);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Pabellon> findPabellonByNombre(String nombre) {
        return findPabellonByNombre(nombre);
    }
}
