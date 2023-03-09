/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca.desafio;

/**
 *
 * @author luist
 */
public class Ferrari extends Carro implements Esportivo, Luxo {
    
    
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;
    
    public Ferrari(){
        this(300);
    }
    
    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }
    
    
    
//    @Override
//    void acelerar(){
//        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
//            velocidadeAtual = VELOCIDADE_MAXIMA;
//        }else{
//            velocidadeAtual += delta;
//        }
//    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }
    
    @Override
    public int getDelta(){
        if(ligarTurbo && !ligarAr) {
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else if(!ligarTurbo && !ligarAr){
            return 20;
        }else{
            return 15;
        }
    }
    
}
