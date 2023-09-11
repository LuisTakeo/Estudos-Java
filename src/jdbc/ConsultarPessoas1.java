/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luist
 */
public class ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException {
        
        Connection conexao = FabricaConexao.getConexao();
        String sql = "Select * from pessoas";
        
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        
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
    }
}
