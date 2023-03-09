/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

import java.util.ArrayList;

/**
 *
 * @author luist
 */
public class Compra {
    
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();
    
    // relação 1 pra N
    void adicionarItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }
    
    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }
    
    double obterValorTotal(){
        double total = 0;
        
        for(Item item: itens){
            total += item.calculaValor();
        }
        
        return total;
    }
    
}
