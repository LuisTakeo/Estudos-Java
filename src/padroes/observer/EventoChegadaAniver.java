/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observer;

import java.util.Date;

/**
 *
 * @author luist
 */
public class EventoChegadaAniver {
    
    private final Date momento;

    public Date getMomento() {
        return momento;
    }
    
    public EventoChegadaAniver(Date momento){
        this.momento = momento;
    }
    
}
