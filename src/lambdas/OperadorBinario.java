/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 *
 * @author luist
 */
public class OperadorBinario {
    public static void main(String[] args) {
        
        BinaryOperator<Double> media = 
                (nota1, nota2) -> (nota1 + nota2) / 2;
        System.out.println(media.apply(9.8, 5.7));
        
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        
        System.out.println(resultado.apply(9.7, 4.1));
        
        
        Function<Double, String> conceito = 
                m -> m >= 7 ? "Aprovado" : "Reprovado";
        
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
        
    }
}
