/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lambdas;

/**
 *
 * @author luist
 */
@FunctionalInterface
public interface Calculo {
    
    double executar(double a, double b);
    
    default String legal() {
        return "legal";
    }
    
    static String muitoLegal(){
        return "muito legal";
    }
    
}
