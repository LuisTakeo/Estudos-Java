/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

/**
 *
 * @author luist
 */
public class testeDrive {
    
    public static void main(String[] args) {
        Carro civic1 = new Civic();
        Ferrari ferrari1 = new Ferrari();

        System.out.printf("Civic: %dkm \n",civic1.velocidadeAtual);
        System.out.printf("Ferrari: %dkm \n",ferrari1.velocidadeAtual);
        ferrari1.ligarTurbo();// só vai ter acesso a esse metodo se criar um objeto mais especifico
        ferrari1.ligarAr();
        System.out.println(ferrari1.velocidadeDoAr());
        ferrari1.desligarTurbo();
        
        civic1.acelerar();
        civic1.acelerar();
        civic1.acelerar();
        
        ferrari1.acelerar();
        System.out.printf("Ferrari: %dkm \n",ferrari1.velocidadeAtual);
        ferrari1.acelerar();
        System.out.printf("Ferrari: %dkm \n",ferrari1.velocidadeAtual);
        ferrari1.acelerar();
        System.out.printf("Ferrari: %dkm \n",ferrari1.velocidadeAtual);
        ferrari1.acelerar();

        
        System.out.printf("Civic: %dkm \n", civic1.velocidadeAtual);
        System.out.printf("Ferrari: %dkm \n",ferrari1.velocidadeAtual);
        
        civic1.frear();
        civic1.frear();
        civic1.frear();
        civic1.frear();
        ferrari1.frear();
        ferrari1.frear();
        ferrari1.frear();
        ferrari1.frear();
        
        System.out.printf("Civic: %dkm \n", civic1.velocidadeAtual);
        System.out.printf("Ferrari: %dkm \n",ferrari1.velocidadeAtual);
        
        
        
    }
}
