/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class Matriz {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int qtdAlunos, qtdNotas;
        
        System.out.println("Insira a quantidade de alunos: ");
        qtdAlunos = entrada.nextInt();
        System.out.println("Insira a quantidade de notas");
        qtdNotas = entrada.nextInt();
        
        double[][] notasAlunos = new double[qtdAlunos][qtdNotas];
        double[] media = new double[qtdAlunos];
        double totalAluno = 0, totalTurma = 0, mediaTurma;
        
        for (int a = 0; a < notasAlunos.length; a++) {
            System.out.printf("Insira as notas do %dº aluno.\n", 
                    a + 1);
            for (int n = 0; n < notasAlunos[a].length; n++) {
                
                System.out.printf("%dª nota: ", (n+1));
                notasAlunos[a][n] = entrada.nextDouble();
                totalAluno += notasAlunos[a][n];
            }
            media[a] = totalAluno / notasAlunos[a].length;
            System.out
                    .printf("A média do %dº aluno é de %.2f\n", 
                    (a+1),media[a]);
            totalTurma += totalAluno;
            totalAluno = 0;
        }
        mediaTurma = totalTurma /(qtdAlunos * qtdNotas);
               
        System.out
                .printf("\nA média da turma é de %.2f. \n",
                        mediaTurma);
        
        for(double[] notasDoAluno: notasAlunos){
            System.out
                    .println(Arrays
                            .toString(notasDoAluno));
        }
        
        entrada.close();
    }
}
