/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.abstrato;

/**
 *
 * @author luist
 */
public abstract class Mamifero extends Animal {
    
    
    public abstract String mamar();
    
    @Override
    public final String mover() {
        return "Saindo do lugar";
    }
    // sendo final, não é possível mais redefinar nas subclasses
    
}
