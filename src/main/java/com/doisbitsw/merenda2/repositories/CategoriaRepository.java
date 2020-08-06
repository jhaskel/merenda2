package com.doisbitsw.merenda2.repositories;

import com.doisbitsw.merenda2.domains.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{


}
