/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author luist
 */
public class DesfioFilter2 {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto(
                "Notebook", 2999.99, 0.40, true);
        Produto p2 = new Produto(
                "Headset", 299.99, 0.10, false);
        Produto p3 = new Produto(
                "Cadeira gamer", 2999.99, 0.35, false);
        Produto p4 = new Produto(
                "PS5", 2999.99, 0.30, true);
        Produto p5 = new Produto(
                "mesa", 2999.99, 0.15, true);
        
        
        Predicate<Produto> isDescontoMaiorTrinta =
                produto -> produto.desconto >= 0.30;
        Predicate<Produto> isFreteGratis = 
                produto -> produto.freteGratis;
        Function<Produto, String> mostraDestaques =
                produto -> String.format(
                        "O %s está com %.0f por cento de desconto"
                                + "\nDe R$%.2f \nPor R$%.2f", 
                        produto.nome, produto.desconto * 100, 
                        produto.preco, produto.calculaDesconto());
        
        List<Produto> produtosDaLoja = Arrays.asList(p1, p2, p3, p4, p5);
        
        System.out.println("Destaques com frete gratis: ");
        produtosDaLoja.stream()
                .filter(isDescontoMaiorTrinta)
                .filter(isFreteGratis)
                .map(mostraDestaques)
                .forEach(System.out::println);
        
        
    }
    
}
