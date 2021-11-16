package bd;

import java.sql.SQLException;

public class Funcionariosbd extends connect {

        public void addFuncionario(String nome, String funcao){
            String sql = "INSERT INTO funcionario (nome,funcao) VALUES (?,?) ";
            try {
                abrirBanco();
                pst = com.prepareStatement(sql);
                pst.setString(1, nome);
                pst.setString(2, funcao);
                pst.execute();
                fecharBanco();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
