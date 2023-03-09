/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author luist
 */
public class Trabalho1 implements Runnable {
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #01");
            try{
                Thread.sleep(100);
            }catch(Exception e){
                       
            }
        }
    }
}
