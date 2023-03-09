/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca;

/**
 *
 * @author luist
 */
public class Heroi extends Jogador {
    
    public Heroi(int x, int y){
        super(x, y);//esse está chamando o construtor da classe pai
    }
    
    @Override
    public boolean atacar(Jogador oponente){
        
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
