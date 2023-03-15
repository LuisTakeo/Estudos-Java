/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author luist
 */
public class Filter {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 8.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);
        
        Predicate<Aluno> isAprovado =
                aluno -> aluno.nota >= 7;
        Function<Aluno, String> informarAprovacao = 
                aluno -> String.format(
                        "Parabens %s, você foi aprovado(a)!", 
                        aluno.nome);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        
        alunos.stream()
                .filter(isAprovado)
                .map(informarAprovacao)
                .forEach(System.out::println);
        
        
        
    }
}
