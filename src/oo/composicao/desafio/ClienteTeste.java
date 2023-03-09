/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao.desafio;

/**
 *
 * @author luist
 */
public class ClienteTeste {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Takeo");
                
        Compra compra1 = new Compra();
        cliente1.adicionarCompra(compra1);
        compra1.adicionarItem("Caneta", 10.50, 2);
        compra1.adicionarItem(new Produto("Notebook", 2544.55),
                2);
        
        Compra compra2 = new Compra();
        cliente1.adicionarCompra(compra2);
        compra2.adicionarItem("Caderno", 11.50, 3);
        compra2.adicionarItem(new Produto("Manga", 25.55),
                5);
        
        
        System.out.println(cliente1);
        for(Item item: compra1.itensCompra){
            System.out.println("Produto: " + item.produto);
            System.out.println("Quantidade: " + item.quantidade);
            System.out.printf("Valor: R$%.2f \n\n",
                    item.calculaValorItens());
        }
        for(Item item: compra2.itensCompra){
            System.out.println("Produto: " + item.produto);
            System.out.println("Quantidade: " + item.quantidade);
            System.out.printf("Valor: R$%.2f \n\n",
                    item.calculaValorItens());
        }
                
        System.out.printf("O valor total de suas compras é de R$%.2f \n\n",
                cliente1.obterValorTotal());
        
        
        Cliente cliente2 = new Cliente("Edith");
                
        Compra compra3 = new Compra();
        compra3.adicionarItem("TV", 1055.50, 
                2);
        compra3.adicionarItem(new Produto("Lampada", 44.50),
                10);
        
        Compra compra4 = new Compra();
        compra4.adicionarItem("Memoria Ram", 114.50, 
                2);
        compra4.adicionarItem(new Produto("Óculos", 1225.55),
                1);
        
        cliente2.adicionarCompra(compra3);
        cliente2.adicionarCompra(compra4);
        
        
        System.out.println(cliente2);
        for(Item item: compra3.itensCompra){
            System.out.println("Produto: " + item.produto);
            System.out.println("Quantidade: " + item.quantidade);
            System.out.printf("Valor: R$%.2f \n\n",
                    item.calculaValorItens());
        }
        for(Item item: compra4.itensCompra){
            System.out.println("Produto: " + item.produto);
            System.out.println("Quantidade: " + item.quantidade);
            System.out.printf("Valor: R$%.2f \n\n",
                    item.calculaValorItens());
        }
                
        System.out.printf("O valor total de suas compras é de R$%.2f \n",
                cliente2.obterValorTotal());
        
    }
}
