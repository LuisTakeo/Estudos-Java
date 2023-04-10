/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package padroes.observer;

/**
 *
 * @author luist
 */

@FunctionalInterface
public interface ObservadorChegada {
    public void chegou(EventoChegadaAniver evento);
}
