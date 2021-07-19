package br.com.clean.dominio.aluno;

import lombok.Data;

import java.util.Objects;

@Data
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (Objects.isNull(ddd ) || Objects.isNull(numero)) {
            throw new IllegalArgumentException("DDD e Número são obrigatorios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido!");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Número inválido!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
