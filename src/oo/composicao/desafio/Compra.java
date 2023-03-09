/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luist
 */
public class Compra {
    
    final List<Item> itensCompra = new ArrayList<>();
    
    void adicionarItem(Produto p, int quantidade){
        this.itensCompra.add(new Item(p, quantidade)
        );
    }
    void adicionarItem(String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco);
        this.itensCompra.add(new Item(produto, quantidade)
        );
    }
    
    double obterValorTotal(){
        
        double total = 0;
        for(Item item: itensCompra){
            total += item.calculaValorItens();
        }
        return total;
    }
}
