/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaA;


import excecao.Aluno;

/**
 *
 * @author luist
 */
public class Validar {
    
    public static void aluno(Aluno aluno){
        
        if(aluno == null){
            throw new IllegalArgumentException(
                    "O aluno está nulo");
        }
        
        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }
        
        if(aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervalo("nota");
        }
        
    }
    
}
