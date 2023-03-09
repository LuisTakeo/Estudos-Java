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
public class Cliente {
    
    final String nomeCliente;
    final List<Compra> listaCompras = new ArrayList<>();
    
    Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    void adicionarCompra(Compra compra){
        this.listaCompras.add(compra);
    }
    
    double obterValorTotal(){
        double total = 0;
        
        for(Compra compra: listaCompras){
            total += compra.obterValorTotal();
        }
        
        return total;
    }

    @Override
    public String toString() {
        return this.nomeCliente; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
