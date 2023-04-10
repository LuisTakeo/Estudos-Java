/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observer;

/**
 *
 * @author luist
 */
public class AniversarioSurpresa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();
        
        porteiro.registrarObservador(namorada);
        porteiro.registrarObservador(e -> {
            System.out.println("Surpresa via lambda");
            System.out.println(e.getMomento());
                    
        });
        porteiro.monitorar();
    }
}
