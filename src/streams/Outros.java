/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author luist
 */
public class Outros {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);
        
        List<Aluno> alunos = 
                Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
        
        System.out.println("Distinct");
        alunos.stream().distinct().forEach(System.out::println);
        // para que seja implementado certo com objetos, é necessário implementar o hash code
        
        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
        
        System.out.println("\nTake While");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
        
        // essas são funções intermediárias
        
    
    }
    
}
