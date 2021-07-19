package br.com.clean.dominio.indicacao;

import br.com.clean.dominio.aluno.Aluno;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Indicacao {

    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDateTime.now();
    }
}
