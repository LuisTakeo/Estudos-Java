/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author luist
 */
public class Usuario {
    
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
               
        if(objeto instanceof Usuario){
            
            Usuario outro = (Usuario) objeto;
        
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else{
            return false;
        }
        
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
    
    
    
    
}
