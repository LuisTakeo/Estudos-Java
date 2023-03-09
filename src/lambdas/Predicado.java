/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Predicate;

/**
 *
 * @author luist
 */
public class Predicado {
    
    public static void main(String[] args) {
        
        Predicate<Produto> isCaro = 
                prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        
        Produto produto = new Produto(
                "Notebook", 3893.93, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
