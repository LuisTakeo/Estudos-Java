/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca;

/**
 *
 * @author luist
 */
public class Jogador {
    
    private int vida = 100;
    protected int x;
    protected int y;
    
    
    protected Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getVida(){
        return this.vida;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public boolean atacar(Jogador oponente){
        
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);
        
        if(deltaX == 0 && deltaY == 1){
            oponente.vida -=10;
            return true;
        }else if(deltaX == 1 && deltaY == 0){
            oponente.vida -=10;
            return true;
        }else{
            return false;
        }

    }
    
    public boolean andar(Direcao direcao){
        
        switch(direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        
        return true;
    }
}
