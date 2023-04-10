/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author luist
 */
public class CaixaIntTeste {
    public static void main(String[] args) {
        
        CaixaInt caixaA = new CaixaInt();
        caixaA.aguardar(123);
        
        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
