/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaA;

/**
 *
 * @author luist
 */
@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException {
    
    private String nomeDoAtributo;
    
    public NumeroForaIntervalo(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
    
    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo",
                nomeDoAtributo); 
    }
    
}
