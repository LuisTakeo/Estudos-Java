/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author luist
 */
public class CaixaTeste {
    
    public static void main(String[] args) {
        
        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("Segredo");
        //quando declaramos o tipo, tudo o que estava como generico vira o tipo
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
        
        Caixa<Double> caixaB = new Caixa<>();
        caixaB.aguardar(3.1415);
        
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
        
    }
}
