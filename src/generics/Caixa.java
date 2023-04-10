/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author luist
 */
public class Caixa<T> {
    
    private T coisa;
    
    public void aguardar(T coisa){
        this.coisa = coisa;
    }
    
    public T abrir(){
        return this.coisa;
    }
    
}
