package com.api.mecanica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DesafioDTO (

        @NotBlank(message = "Favor Não deixar o campo em branco")
        String nomeCliente,
        @NotNull(message = "Favor Não deixar o campo em branco")
        Integer idade,
        @NotBlank(message = "Favor Não deixar o campo em branco")
        String cpf,
        @Pattern(regexp = "S|N", message = "Favor inserir S ou N")
        String flStatus

){}
