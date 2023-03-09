/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author luist
 */
public class Consumidor {
        
    public static void main(String[] args) {
        
        // Consumer recebe um parametro e executa sem retorno;
        
        Consumer<Produto> imprimirInfo = p -> System.out.println(p.toString()); 
        
        
        Produto p1 = new Produto(
                "Caneta", 12.34, 0.09);
        Produto p2 = new Produto(
                "Notebook", 2983.34, 0.25);
        
        Produto p3 = new Produto(
                "Caderno", 19.94, 0.03);
        Produto p4 = new Produto(
                "Borracha", 7.34, 0.18);
        Produto p5 = new Produto(
                "Lapis", 4.34, 0.19);
        
        
        
        imprimirInfo.accept(p1);
        
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        
        produtos.forEach(imprimirInfo);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
        
    }
}
