/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

/**
 *
 * @author luist
 */
public class Causa {
    public static void main(String[] args){
        try{
            metodoA(null);
        }catch(IllegalArgumentException e){
            System.out.println(e.getCause().getMessage());
        }
        
        metodoA(null);
    }
    
    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }
    
    static void metodoB(Aluno aluno){
        if(aluno == null){
            throw new NullPointerException("O aluno está nulo!!!");
        }
    }
}
