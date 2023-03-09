/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.desafio;

/**
 *
 * @author luist
 */
public class Pessoa {
    
    String nome;
    double peso;
    
    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso;
        }
        
    }
    
    String apresentar(){
        return String.format("Olá eu sou o %s e estou com %.2f kilos", 
                this.nome, this.peso);
    }
    
}
