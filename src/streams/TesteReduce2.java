/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author luist
 */
public class TesteReduce2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println(numeros);
        
        int valor = 1;
        while(numeros.size() < 100){
            numeros.add(valor);
            valor++;
        }
            
        BinaryOperator<Integer> somaValor =
                (valorA, valorB) -> valorA + valorB;
        
        numeros.stream()
                .peek(System.out::println)
                .reduce(somaValor)
                .ifPresent(System.out::println);
        
        
    }
    
}
