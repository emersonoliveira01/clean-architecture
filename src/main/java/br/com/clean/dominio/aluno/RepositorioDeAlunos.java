package br.com.clean.dominio.aluno;

import java.sql.SQLException;
import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno) throws SQLException;

    Aluno buscarAlunoPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();

}
