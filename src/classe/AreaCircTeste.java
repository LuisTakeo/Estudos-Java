/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author luist
 */
public class AreaCircTeste {
    public static void main(String[] args) {
        
        AreaCirc a = new AreaCirc(5.4);
        System.out.printf("%.2f \n",a.area());
        System.out
                .printf("A área do círculo é de %.2f\n", 
                AreaCirc.area(5.5));
        
    }
}
