/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao.desafio;

/**
 *
 * @author luist
 */
public class Produto {
    
    String nome;
    double preco;
    
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String toString(){
        return this.nome;
    }
    
}
