/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author luist
 */
public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conexao = new FabricaConexao().getConexao();
        
        String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome VARCHAR(80) NOT NULL"
                + ")";
        
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        System.out.println("Tabela criada com sucesso");
        
        conexao.close();
    }
}
