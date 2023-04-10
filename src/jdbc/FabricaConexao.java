/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author luist
 */
public class FabricaConexao {
    
    public static Connection getConexao(){
        try {
            final String url
                    = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
            final String usuario = "root";
            final String senha = "";
            
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
