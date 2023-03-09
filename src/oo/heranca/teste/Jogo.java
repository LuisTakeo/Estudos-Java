/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

/**
 *
 * @author luist
 */
public class Jogo {
    
    public static void main(String[] args) {
        
        
        Monstro monstro = new Monstro();
        monstro.setX(10);
        monstro.setY(10);
        
        Jogador heroi = new Heroi(10, 11);
        
        
        
        System.out.printf("Monstro vida: %d \n",monstro.getVida());
        System.out.printf("Herói vida: %d \n",heroi.getVida());

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.printf("Herói vida: %d \n",heroi.getVida());

        
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        
        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        
        System.out.printf("Monstro vida: %d \n",monstro.getVida());
        System.out.printf("Herói vida: %d \n",heroi.getVida());

//        player1.andar(Direcao.NORTE);
//        player1.andar(Direcao.LESTE);
//        player1.andar(Direcao.NORTE);
//        player1.andar(Direcao.LESTE);
//        
//        System.out.println(player1.x);
//        System.out.println(player1.y);
    }
    
}
