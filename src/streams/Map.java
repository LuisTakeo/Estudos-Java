/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 *
 * @author luist
 */
public class Map {
    
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::print;
        
        List<String> marcas = Arrays.asList("BMW ", "Honda ", "Audi \n");
        
        
        marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);
        
//        UnaryOperator<String> letraMaiuscula = nome -> nome.toUpperCase();
        UnaryOperator<String> primeiraLetra = nome -> nome.charAt(0) + "";
//        UnaryOperator<String> grito = nome -> nome.toUpperCase() + "!!!";
        
        System.out.println("Usando composição");
        marcas.stream()
                .map(Utilitarios.letraMaiuscula)
                .map(primeiraLetra)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
    
}
