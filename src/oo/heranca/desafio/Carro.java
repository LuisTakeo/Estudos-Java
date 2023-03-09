/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca.desafio;

/**
 *
 * @author luist
 */
public class Carro {
    
    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;
    private int delta = 5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    
    protected Carro(){
        this(200);
    }
    
    protected Carro(int velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    
    public void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }
    }
    
    public void frear(){
        if(this.velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }
    }
}
