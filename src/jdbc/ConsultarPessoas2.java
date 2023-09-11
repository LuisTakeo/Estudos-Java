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
public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        
        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua busca: ");
        String busca = entrada.nextLine();
        
        String sql = "Select * from pessoas where nome like ?";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,"%" + busca + "%");
        
        
        ResultSet resultado = stmt.executeQuery();
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        while(resultado.next()){
            int codigo = resultado.getInt("id");
            String nome = resultado.getString("nome");
            
            pessoas.add(new Pessoa(codigo, nome));
        }
        
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getCodigo() + " ====> " + pessoa.getNome());
        }
        
        stmt.close();
        conexao.close();
        entrada.close();
    }
    
}
