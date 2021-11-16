package bd;

import java.sql.SQLException;

public class Alunobd extends connect{

    public void addAluno(String nome){
        String sql = "INSERT INTO aluno (nome) VALUES (?)";
        try {
            abrirBanco();
            pst = com.prepareStatement(sql);
            pst.setString(1,nome);
            pst.execute();
            fecharBanco();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
