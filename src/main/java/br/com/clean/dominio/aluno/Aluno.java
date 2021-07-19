package br.com.clean.dominio.aluno;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Aluno {

    private String nome;
    private CPF cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        telefones.add(new Telefone(ddd, numero));
    }
}
