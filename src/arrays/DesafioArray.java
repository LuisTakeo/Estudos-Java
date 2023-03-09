/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;


/**
 *
 * @author luist
 */
public class DesafioArray {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int qtdNotas;
        
        System.out.print("Quantas notas vão ser inseridas? ");
        qtdNotas = entrada.nextInt();
        
        double[] notasAluno = new double[qtdNotas];
        
        
        for(int i = 0; i < notasAluno.length; i++){
            System.out
                    .printf("Insira a %dª nota: ",
                    i + 1);
            notasAluno[i] = entrada.nextDouble();
        }
        
        double total = 0, media;
        
        for(double nota: notasAluno){
            total += nota;
        }
        
        media = total / notasAluno.length;
        
        System.out
                .printf("A média das %d notas do aluno é de %.2f.", 
                        notasAluno.length,media);
        
        entrada.close();
    }
}
