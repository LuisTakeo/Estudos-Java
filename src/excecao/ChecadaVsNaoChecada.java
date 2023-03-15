/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

/**
 *
 * @author luist
 */
public class ChecadaVsNaoChecada {
    
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("passou pelo erro");

    }
    // Exceção não checada ou não verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro agui 01");
        
    }
    
    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro agui 02");
    }
}
