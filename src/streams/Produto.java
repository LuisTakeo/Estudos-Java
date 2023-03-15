/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

/**
 *
 * @author luist
 */
public class Produto {
    
    final String nome;
    final double preco;
    final double desconto;
    final boolean freteGratis;

    public Produto(String nome, double preco, double desconto, boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }
    
    public double calculaDesconto(){
        return this.preco * (1 - this.desconto);
    }
    
    @Override
    public String toString() {
        double precoFinal = this.preco * (1 - this.desconto);
        return String.format("Nome: %s \nValor: R$%.2f", 
                this.nome, precoFinal);
    }
    
}
