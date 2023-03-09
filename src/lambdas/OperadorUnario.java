/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.UnaryOperator;

/**
 *
 * @author luist
 */
public class OperadorUnario {
    
    public static void main(String[] args) {
        
        // Unary recebe um valor e volta um valor
        
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;
        
        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(resultado1);
        
        int resultado2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);
        
        System.out.println(resultado2);
        
    }
}
