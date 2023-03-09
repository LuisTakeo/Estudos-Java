/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

/**
 *
 * @author luist
 */
public class Julia {
    
    Ana sogra = new Ana();
    void testeAcessos(){
//        System.out.println(sogra.segredo); //não consegue ver pois é privado
//        System.out.println(sogra.façoDentroDeCasa);
//        System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
        
        
        
    }
    
    
    
}
