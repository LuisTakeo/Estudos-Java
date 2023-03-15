/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 *
 * @author luist
 */
public class testeReduce {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7 , 8, 9, 10);  
        
        BinaryOperator<Integer> somaNumeros =
                (acumulador, valor) -> acumulador + valor;
        
        numeros.stream()
                .reduce(somaNumeros)
                .ifPresent(System.out::println);
        
        int total = numeros.stream().reduce(somaNumeros).get();
        System.out.println(total);
        
        // esse ta gerando um valor inicial para todos os valores em paralelo
        int total2 = numeros.parallelStream().reduce(
                100, somaNumeros);
        
        System.out.println(total2);
        
        int total3 = numeros.stream().reduce(100, somaNumeros);
        System.out.println(total3);
        
        numeros.stream()
                .filter(n -> n > 10)
                .reduce(somaNumeros)
                .ifPresent(System.out::println);
    
    }
}
