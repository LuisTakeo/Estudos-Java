/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.encapsulamento.casaA;

/**
 *
 * @author luist
 */
public class Paulo {
    
    Ana esposa = new Ana();
    
    void testeAcessos(){
//        System.out.println(esposa.segredo); //não consegue ver pois é privado
        System.out.println(esposa.façoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    
        
    
    }
}
