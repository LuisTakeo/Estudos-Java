/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observer;

/**
 *
 * @author luist
 */
public class Namorada implements ObservadorChegada {

    @Override
    public void chegou(EventoChegadaAniver evento) {
        System.out.println("Avisar convidados");
        System.out.println("Apagar luz");
        System.out.println("Esperar um pouco");
        System.out.println("Surpresa");     
    }

}
