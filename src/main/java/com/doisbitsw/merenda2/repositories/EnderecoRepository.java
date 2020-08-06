package com.doisbitsw.merenda2.repositories;

import com.doisbitsw.merenda2.domains.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{


}
