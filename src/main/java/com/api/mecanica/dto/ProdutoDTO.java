package com.api.mecanica.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ProdutoDTO(
         @NotBlank(message = "Favor Não deixar o campo em branco")
         String nomeProduto,
         @DecimalMin(value = "0.01")
         Double vlProduto,
         @Pattern(regexp = "S|N", message = "Favor inserir S ou N")
         String flAtivo
) {}
