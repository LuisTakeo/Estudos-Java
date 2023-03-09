/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author luist
 */
public class CalculoTeste2 {
    
    public static void main(String[] args) {
        
        Calculo calc = (x, y) -> {double a = x + y; return a;};
        
        System.out.println(calc.executar(2,3));
        
        calc = (x, y) -> x * y; // forma reduzida, quando tiver 1 linha só
        System.out.println(calc.executar(2,3));
        
        System.out.println(calc.legal());
        System.out.println(Calculo.muitoLegal());
        
        
    }
}
