package com.doisbitsw.merenda2.repositories;

import com.doisbitsw.merenda2.domains.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{


}
