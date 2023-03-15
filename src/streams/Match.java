/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author luist
 */
public class Match {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        
        Predicate<Aluno> isAprovado = a -> a.nota >= 7;
        Predicate<Aluno> isReprovado = isAprovado.negate();
        
        // essas funções são terminadoras
        System.out.println(alunos.stream().allMatch(isAprovado));
        System.out.println(alunos.stream().anyMatch(isAprovado));
        System.out.println(alunos.stream().noneMatch(isAprovado));
        System.out.println(alunos.stream().noneMatch(isReprovado));

        
    }
}
