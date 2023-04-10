/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author luist
 */
public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        
        final String url = 
                "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "";
        
        Connection conexao = DriverManager
                .getConnection(url, usuario, senha);



        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        
        System.out.println("Comando realizado com sucesso");
        
        conexao.close();
    }
}
