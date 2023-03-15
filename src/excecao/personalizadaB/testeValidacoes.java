/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaB;

import excecao.Aluno;

/**
 *
 * @author luist
 */
public class testeValidacoes {
    
    public static void main(String[] args) {
        
        try {
            Aluno aluno1 = new Aluno("Ana", -7);
            Validar.aluno(aluno1);
            
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervalo 
                | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Aluno aluno2 = new Aluno("Ana", -7);
            Validar.aluno(aluno2);
        } catch (StringVaziaException | NumeroForaIntervalo e) {
            System.out.println(e.getMessage());
        }
    
        System.out.println("Fim");
    
    }
}
