package bd;

import java.sql.SQLException;

public class Professorbd extends connect {
    public void addProfessor(String nome, String materia) {
        String sql = "INSERT INTO professor (nome, materia) VALUES (?, ?)";
        try {
            abrirBanco();
            pst = com.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, materia);
            pst.execute();
            fecharBanco();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
