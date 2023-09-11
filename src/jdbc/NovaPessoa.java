/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class NovaPessoa {
    public static void main(String[] args) throws SQLException  {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
        
        Connection conexao = FabricaConexao.getConexao();
        
        String sql = "INSERT INTO PESSOAS (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();
        
        System.out.println("Pessoa incluida com sucesso");
        entrada.close();
    }
}
