/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.polimorfismo;

/**
 *
 * @author luist
 */
public class Jantar {
    
    public static void main(String[] args) {
        
        Pessoa convidado = new Pessoa(99.65);
        
        Comida ingrediente1 = new Arroz(0.2);
        Comida ingrediente2 = new Feijao(0.1);
        
        System.out.println(convidado.getPeso());
        
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        
        System.out.println(convidado.getPeso());
        
        Comida ingrediente3 = new Sorvete(0.400);
        
        convidado.comer(ingrediente3);
        System.out.println(convidado.getPeso());
        
        
    }
}
