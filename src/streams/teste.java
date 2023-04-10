/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author luist
 */
public class teste {
    public static void main(String[] args) {
        
        int saldo = -90;
        int juros = 2;
        
        if(saldo > 100) {
            System.out.println("Você possui valor pra gastar: " + saldo);
            saldo = saldo + juros;
            System.out.println("Você acumulou o valor de " + saldo);
        }else if(saldo < 100 && saldo > 0){
            System.out.println("Você está pobre. Sinto muito, o seu valor é " + saldo);
            System.out.println("Você não acumulou nenhum juros para seu saldo.");
        }else{
            System.out.println("Você está negativo. Controle-se homem(mulher)!!!!");
        }   
            
       
        
//        ArrayList<Integer> numeros = new ArrayList();
//        int i = 1;
//        while(numeros.size() < 100) numeros.add(i++);
//        
//        
//        Consumer<Integer> mostraTexto = 
//                n -> {
//                    if((n % 10 == 0) || (n % 10 == 9 && n > 10)){
//                        System.out.printf("%d \n", n);                    
//                    }else if(n % 10 == 9){
//                        System.out.printf(" %d \n", n); 
//                    }else if(n < 10){
//                        System.out.printf(" %d  ", n);
//                    }else{
//                        System.out.printf("%d  ", n);
//                    }                    
//                };
////        System.out.println(numeros);
//        ArrayList<Integer> numerosPares = new ArrayList();
//        ArrayList<Integer> numerosImpares = new ArrayList();
//
//        numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .forEachOrdered(numerosPares::add);
//        System.out.println("Numeros Pares");
//        numerosPares.stream().forEach(mostraTexto);
//        
//        numeros.stream()
//                .filter(n -> n % 2 != 0)
//                .forEachOrdered(numerosImpares::add);
//        
//        System.out.println("\n\nNumeros Impares");
//        numerosImpares.stream().forEach(mostraTexto);
//        
//        System.out.println("\n");
//        System.out.println(13 % 10);
        
    }
}
