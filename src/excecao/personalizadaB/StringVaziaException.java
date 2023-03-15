/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaB;

/**
 *
 * @author luist
 */
@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
    
    private String nomeDoAtributo;
    
    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
    
    public String getMessage() {
        return String.format("O atributo '%s' está vazio",
                nomeDoAtributo); 
    }
    
}
