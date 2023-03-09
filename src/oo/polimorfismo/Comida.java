/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.polimorfismo;

/**
 *
 * @author luist
 */
public abstract class Comida {
    // classe abstrata não pode ser instanciada
    private double peso;
    
    Comida(double peso) {
        setPeso(peso);
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
