/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author luist
 */
public class Fornecedor {
    public static void main(String[] args) {
        
        // supplier não recebe parametro e retorna algo
        Supplier<List<String>>umaLista = 
                () -> Arrays.asList("Ana", "Lia", "Bia", "Gui");
        
        System.out.println(umaLista.get());
        
        
        
    }
}
