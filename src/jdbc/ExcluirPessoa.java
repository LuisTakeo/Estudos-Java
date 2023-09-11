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
public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código da pessoa que deseja excluir:");
        int id = entrada.nextInt();
        
        Connection conexao = FabricaConexao.getConexao();
        String excluirSQL = "DELETE FROM pessoas WHERE id = ?";
        
        System.out.println("Deseja mesmo excluir? (S/N)");
        boolean decisao = entrada.next().equalsIgnoreCase("s");
        System.out.println(decisao);
        if(decisao){
            PreparedStatement stmt = conexao.prepareStatement(excluirSQL);;
            stmt.setInt(1, id);
            
            int linhasAlteradas = stmt.executeUpdate();
            if(linhasAlteradas > 0){
                System.out.println("Pessoa excluida com sucesso");
            }else{
                System.out.println("Nada encontrado");
            }
            
            System.out.println("Linhas alteradas: " + linhasAlteradas);
        }
        
        
        conexao.close();
        entrada.close();
    }
    
}
