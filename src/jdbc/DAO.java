/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luist
 */
public class DAO {
    
    private Connection conexao;
    
    public int incluir(String sql, Object... atributos){
        try{
            PreparedStatement stmt = getConexao()
                    .prepareStatement(sql, 
                            PreparedStatement
                                    .RETURN_GENERATED_KEYS);
            
            adicionarAtributos(stmt, atributos);
            
            if(stmt.executeUpdate() > 0){
                ResultSet resultado = stmt.getGeneratedKeys();
                
                if(resultado.next()){
                    return resultado.getInt(1);
                }
            }
            
            return -1;
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
    private void adicionarAtributos(PreparedStatement stmt,
            Object[] atributos) throws SQLException {
        int indice = 1;
        for(Object atributo: atributos){
            if(atributo instanceof String){
                stmt.setString(indice, (String) atributo);
            }else if(atributo instanceof Integer){
                stmt.setInt(indice, (Integer) atributo);
            }
            
            indice++;
        }
    }
    
    private Connection getConexao(){
        try {
            if(conexao != null && !conexao.isClosed()){
                return conexao;
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        
        conexao = FabricaConexao.getConexao();
        return conexao;
    }
    
    public void close(){
        try{
            getConexao().close();
        }catch(SQLException e){
            e.getMessage();
        }finally{
            conexao = null;
        }
    }
    
}
