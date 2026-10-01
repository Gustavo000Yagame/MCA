package com.api.mecanica.repository;

import com.api.mecanica.model.Desafio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DesafioRepository extends JpaRepository<Desafio, Integer> {

    Optional<Desafio> findBy(Integer id);
    Optional<Desafio> findAllBy(Integer id);
}