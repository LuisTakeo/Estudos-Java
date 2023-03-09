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
public class Pedro extends Ana {
    

    
    void testeAcessos(){
//        System.out.println(segredo); //não consegue ver pois é privado
//        System.out.println(façoDentroDeCasa); //não é transmitido pois não esta no mesmo pacote
        System.out.println(formaDeFalar); //esse só vai ser recebido via herança
        System.out.println(todosSabem);
        System.out.println(new Ana().todosSabem);
        
        
    }
    
}
