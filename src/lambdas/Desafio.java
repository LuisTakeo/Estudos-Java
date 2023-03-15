/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.math.BigDecimal;
import java.util.function.Function;
import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 *
 * @author luist
 */
public class Desafio {
    
    public static void main(String[] args) {
     
        Produto p1 = new Produto(
                "Ipad", 3235.89, 0.13);
        
        // a partir do produto calcular o preco real(com desconto)
        // Imposto Municial >= 2500(8.5%)/ < 2500 (Isento)
        // Frete >= 3000 (100)/ < 3000 (50)
        // Arredondar: deixar duas casas decimais
        // formatar: R$1234,56
        
        
        Function<Produto, Double> precoFinal =
                (prod) -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> impostoMunicipal =
                valor -> valor >= 2500 ?
                        valor * 1.085 : valor;
        UnaryOperator<Double> cobrarFrete =
                valor -> valor >= 3000 ?
                        valor + 100 : valor + 50;
        UnaryOperator<Double> arredondaValor =
                valor -> Math.round(valor * 100.0)/100.0;
        Function<Double, String> formataPreco =
                valor -> String.format(
                        "R$%.2f", valor)
                .replace(".", ",");
        
        
        System.out.println(precoFinal
                .andThen(impostoMunicipal)
                .andThen(cobrarFrete)
                .andThen(arredondaValor)
                .andThen(formataPreco)
                .apply(p1)
        );
        
        
        
    }    
}
