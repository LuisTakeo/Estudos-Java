/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author luist
 */
public class Reduce3 {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        
        Predicate<Aluno> isAprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        
        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia =
                (m1, m2) -> Media.combinar(m1, m2);
            
        
        Media media = alunos.parallelStream()
                .filter(isAprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);
        
        System.out.println("A média dos aprovados é " + media.getValor());
    }
}
