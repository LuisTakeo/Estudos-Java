/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.abstrato;

/**
 *
 * @author luist
 */
public class TesteAbstrato {
    
    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(a.mover());
        System.out.println(a.respirar());
        // a.mamar() não fica disponível aqqui
        // pois não está disponível para o tipo generico Animal
        
        Mamifero b = new Cachorro();
        System.out.println(b.mover());
        System.out.println(b.respirar());
        System.out.println(b.mamar());
    }
    
}
