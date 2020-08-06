package com.doisbitsw.merenda2.repositories;

import com.doisbitsw.merenda2.domains.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{


}
