/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author luist
 */
public class CompraTeste {
    
    public static void main(String[] args) {
        
        Compra c1 = new Compra();
        c1.cliente = "Takeo";
        // relação 1 pra N
        
        c1.adicionarItem("Caneta", 20, 7.42);
        c1.adicionarItem(new Item(
                "Borracha", 12, 2.42)
        );
        c1.adicionarItem(new Item(
                "Caderno", 3, 19.42)
        );
        
        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
        
    }
}
