/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class Porteiro {
    private List<ObservadorChegada> observadores = new ArrayList<>();
    
    public void registrarObservador(ObservadorChegada o) {
        observadores.add(o);
    }
    
    public void monitorar(){
        Scanner entrada = new Scanner(System.in);
        
        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Aniversariante chegou?");
            valor = entrada.nextLine();
            if(valor.equalsIgnoreCase("sim")){
                EventoChegadaAniver evento = new EventoChegadaAniver(new Date());
                
                observadores.stream().forEach(observador -> observador.chegou(evento));
                valor = "sair";
            }else{
                System.out.println("Alarme falso");
            }
        }
    }
}
