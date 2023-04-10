/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author luist
 */
public class AreaCirc {
    
    double raio;
    final static double PI = 3.14;
    
    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    
    void area2() {
        double raio2 = PI * Math.pow(raio, 2);
    }
    
    double area() {
        return PI * Math.pow(raio, 2);
    }
    
    static double area(double raioA){
        return PI * Math.pow(raioA, 2);
    }
    
}
