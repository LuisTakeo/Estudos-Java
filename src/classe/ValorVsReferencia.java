/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author luist
 */
public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor(tipo primitivo)
        a++;
        b++;
        System.out.println(a + " " + b);
        
        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }
}
