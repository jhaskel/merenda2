package com.doisbitsw.merenda2.services;

import java.util.Optional;

import com.doisbitsw.merenda2.domains.Categoria;
import com.doisbitsw.merenda2.repositories.CategoriaRepository;
import com.doisbitsw.merenda2.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
