/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class AlteraNomePessoa {
    public static void main(String[] args) throws SQLException {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();
        
        String selectSQL = "Select id, nome FROM pessoas WHERE id = ?";
        String updateSQL = "Update pessoas set nome = ? WHERE id = ?";
        
        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(selectSQL);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();
        
        if(resultado.next()){
            Pessoa p = new Pessoa(resultado.getInt("id"), 
                    resultado.getString("nome"));
            
            System.out.printf("O nome atual é %s \n", p.getNome());
            entrada.nextLine();
            
            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine();
            
            stmt.close();
            stmt = conexao.prepareStatement(updateSQL);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();
            
            System.out.println("Pessoa alterada com sucesso");
            
        }else{
            System.out.println("Pessoa não encontrada");
        }
        
        stmt.close();
        conexao.close();
        entrada.close();
        
        
    }
}
