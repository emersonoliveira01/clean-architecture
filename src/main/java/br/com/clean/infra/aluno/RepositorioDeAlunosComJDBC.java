package br.com.clean.infra.aluno;

import br.com.clean.dominio.aluno.Aluno;
import br.com.clean.dominio.aluno.CPF;
import br.com.clean.dominio.aluno.RepositorioDeAlunos;
import br.com.clean.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        String sql = "INSERT INTO ALUNO VALUES(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf().getNumero());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail().getEndereco());
            ps.execute();

            sql = "INSERT INTO TELEFONE VALUES (?,?)";
            for (Telefone item : aluno.getTelefones()) {
                ps.setString(1, item.getDdd());
                ps.setString(2, item.getNumero());
                ps.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Aluno buscarAlunoPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
