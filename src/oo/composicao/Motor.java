/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author luist
 */
public class Motor {
    
    Carro carro;
    
    Motor(Carro carro){
        this.carro = carro;
    }
    
    
    double fatorInjecao = 1;
    boolean ligado = false;
    
    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorInjecao * 3000);
        }
            
    }
}
