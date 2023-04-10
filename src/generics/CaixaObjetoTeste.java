/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author luist
 */
public class CaixaObjetoTeste {
    
    public static void main(String[] args) {
        
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3);
        
        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);
        
        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.aguardar("Presente");
        
        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
}
