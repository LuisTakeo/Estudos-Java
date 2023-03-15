/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

/**
 *
 * @author luist
 */
public class MediaTeste {
    
    public static void main(String[] args) {
        
        Media m1 = new Media()
                .adicionar(8.3)
                .adicionar(6.7);
        Media m2 = new Media()
                .adicionar(7.9)
                .adicionar(6.6);
        
        System.out.println(m1.getValor());
        System.out.println(m2.getValor());
        
        System.out.println(Media.combinar(m1, m2).getValor());
        
    }
}
