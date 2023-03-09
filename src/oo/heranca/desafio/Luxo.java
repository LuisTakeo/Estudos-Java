/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oo.heranca.desafio;

/**
 *
 * @author luist
 */
public interface Luxo {
    
    void ligarAr();
    void desligarAr();
    // o default possibilita dar uma implementação padrão 
    // para as classes que tem essa interface
    default int velocidadeDoAr() {
        return 1;
    };
}
