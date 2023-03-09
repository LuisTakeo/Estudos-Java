/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca;

/**
 *
 * @author luist
 */
public class Monstro extends Jogador {
    
    public Monstro() {
        this(0,0);//esse está chamando o debaixo
    }
    
    public Monstro(int x, int y){
        super(x, y);//esse está chamando o construtor da classe pai
    }
    
}
