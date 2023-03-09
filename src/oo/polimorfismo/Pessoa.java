/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.polimorfismo;

/**
 *
 * @author luist
 */
public class Pessoa {
    
    private double peso;
    
    Pessoa(double peso) {
        setPeso(peso);
    }
    
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
//    public void comer(Feijao feijao){;
//        this.peso += feijao.getPeso();
//    }
//    public void comer(Sorvete sorvete){
//        this.peso += sorvete.getPeso();
//    }
//    
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
