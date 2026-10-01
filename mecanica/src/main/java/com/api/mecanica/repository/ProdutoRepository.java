package com.api.mecanica.repository;

import com.api.mecanica.model.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    Optional<Produto> findBy(Integer id);
    Optional<Produto> findAllBy(Integer id);
}
