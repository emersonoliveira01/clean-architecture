package br.com.clean;

import lombok.Data;

import java.util.Objects;

@Data
public class CPF {

    private String numero;

    public CPF(String numero) {
        if (Objects.isNull(numero) || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF é inválido!");
        }
        this.numero = numero;
    }
}
