/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.BinaryOperator;

/**
 *
 * @author luist
 */
public class CalculoTeste3 {
    
    public static void main(String[] args) {
        
        // int -> Double não é possivel
        // double -> Double
        
        BinaryOperator<Double> calc = (x, y) -> x + y;
    
        System.out.println(calc.apply(2.0, 3.0));
        
        calc = (x, y) -> x * y; // forma reduzida, quando tiver 1 linha só
        System.out.println(calc.apply(2.0,3.0));
        
        BinaryOperator<Integer> calc2 = (x, y) -> x + y;
    
        System.out.println(calc2.apply(2, 3));
        
        calc = (x, y) -> x * y; // forma reduzida, quando tiver 1 linha só
        System.out.println(calc2.apply(2,3));
        
    }        
}
