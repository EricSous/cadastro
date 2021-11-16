package bd;

import java.sql.*;

public class connect {
    PreparedStatement pst;
    ResultSet rs;
    Connection com;

     public void abrirBanco(){
        String Usuario="root";
        String Senha="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            com= DriverManager.getConnection("jdbc:mysql://localhost:3306/MeuBanco", Usuario,Senha);
            System.out.println("Conectado com Sucesso!!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Banco desligado!!");

        }
    }
     public void fecharBanco() throws SQLException {
        com.close();
        System.out.println("Fechado com sucesso!!");
    }
}
