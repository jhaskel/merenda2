package com.doisbitsw.merenda2.repositories;

import com.doisbitsw.merenda2.domains.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{


}
