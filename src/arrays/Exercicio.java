/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author luist
 */
public class Exercicio {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        System.out.println(
                Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA.length);
        
        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }
        
        double mediaAlunoA = totalAlunoA / notasAlunoA.length;
        System.out.println(mediaAlunoA);
        
        final double notaArmazenada = 5.5;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
        double totalAlunoB = 0;
        
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        
        double mediaAlunoB = totalAlunoB / notasAlunoB.length;
        
        System.out.println(mediaAlunoB);
    }      
}
