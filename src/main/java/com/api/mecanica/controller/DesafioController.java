package com.api.mecanica.controller;

import com.api.mecanica.dto.DesafioDTO;
import com.api.mecanica.dto.ProdutoDTO;
import com.api.mecanica.model.Desafio;
import com.api.mecanica.model.Produto;
import com.api.mecanica.repository.DesafioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/desafio")
public class DesafioController {
    @Autowired
    DesafioRepository desafioRepository;

    @PostMapping
    public ResponseEntity<Desafio> save(@RequestBody @Valid DesafioDTO desafioDTO) {
        var desafio = new Desafio();
        BeanUtils.copyProperties(desafioDTO, desafio);
        return ResponseEntity.status(HttpStatus.CREATED).body(desafioRepository.save(desafio));
    }

    @GetMapping
    public ResponseEntity<java.util.List<Desafio>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(desafioRepository.findAll());
    }
}