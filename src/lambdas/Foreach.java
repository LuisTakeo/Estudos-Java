/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import javax.swing.SpringLayout;

/**
 *
 * @author luist
 */
public class Foreach {
    
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList(
                "Ana", "Bia", "Lia", "Gui");
    
        System.out.println("Forma tradicional: ");
        for(String nome: aprovados) {
            System.out.println(nome);
        }
        
        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.printf("%s!! \n",nome));
        
        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);
        
        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));
        
        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Foreach::meuImprimir);
        
    
    }
    
    static void meuImprimir(String nome) {
        System.out.printf("Oi! meu nome é %s \n", nome);
    }
    
}
