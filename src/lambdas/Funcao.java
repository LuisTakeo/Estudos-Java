/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;


import java.util.function.Function;
/**
 *
 * @author luist
 */
public class Funcao {
    
    public static void main(String[] args) {
        
        // Function recebe parametro e retorna um parametro
        // podendo ser diferentes

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";
        
        System.out.println(parOuImpar.apply(33));
        System.out.println(parOuImpar.apply(32));
        
        Function<String, String> mostraResultado =
                valor -> String.format(
                        "O resultado é %s", valor);
        
        Function<String, String> empolgado = valor -> valor + "!!!";
        Function<String, String> duvida = valor -> valor + "???";
        
        
        String resultadoFinal1 = parOuImpar
                .andThen(mostraResultado)
                .andThen(empolgado)
                .apply(32);
        
        String resultadoFinal2 = parOuImpar
                .andThen(mostraResultado)
                .andThen(duvida)
                .apply(33);
        
        
        System.out.println(resultadoFinal1);
        System.out.println(resultadoFinal2);
        
    }
}
