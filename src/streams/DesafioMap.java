/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import lambdas.Foreach;

/**
 *
 * @author luist
 */
public class DesafioMap {
    
    public static void main(String[] args) {
        
        
        // numeros para string binária 6 => 110
        // inverter a string 110 => 011
        // converter de volta para inteiro 011 => 3
        
        UnaryOperator<String> inverter = 
                s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> converteDecimal = 
                n -> Integer.parseInt(n, 2);
        
                
        List<Integer> nums = Arrays
                .asList(1, 2, 3, 4 ,5 ,6 ,7, 8, 9);   
                
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(converteDecimal)
                .forEach(System.out::println);
    }
}
