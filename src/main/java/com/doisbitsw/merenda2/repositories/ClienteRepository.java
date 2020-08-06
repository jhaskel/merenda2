package com.doisbitsw.merenda2.repositories;

import com.doisbitsw.merenda2.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{


}
