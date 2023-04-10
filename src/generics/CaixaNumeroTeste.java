/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author luist
 */
public class CaixaNumeroTeste {
    public static void main(String[] args) {
        
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.aguardar(2.3);
        System.out.println(caixaA.abrir());
        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.aguardar(2);
        System.out.println(caixaB.abrir());
    }
}
