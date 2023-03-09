/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author luist
 */
public class Item {
    
    String nome;
    int quantidade;
    double preco;
    Compra compra;
    
    // relação 1 pra N
    
    Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    double calculaValor(){
        return this.preco * this.quantidade;
    }
}
