/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao.desafio;

/**
 *
 * @author luist
 */
public class Item {
    
    final Produto produto;
    final int quantidade;
    
    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    Item(String produto, double preco, int quantidade){
        this.produto = new Produto(produto, preco);
        this.quantidade = quantidade;
    }
    
    double calculaValorItens(){
        return this.produto.preco * this.quantidade;
    }
}
