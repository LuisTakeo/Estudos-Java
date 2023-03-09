/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author luist
 */
public class CursoTeste {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Takeo");
        Aluno aluno2 = new Aluno("Edith");
        Aluno aluno3 = new Aluno("Damião");
        Aluno aluno4 = new Aluno("Nath");
        
        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");
        
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        
        curso2.adicionarAluno(aluno4);
        curso2.adicionarAluno(aluno3);
        
        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        
        for(Aluno aluno: curso1.alunos){
            System.out
                    .printf("Me chamo %s e estou matriculado no curso %s .\n",
                            aluno,curso1
                    );
            
        }
        
        for(Aluno aluno: curso2.alunos){
            System.out
                    .printf("Me chamo %s e estou matriculado no curso %s .\n",
                            aluno,curso2
                    );
            
        }
        
        for(Curso curso: aluno1.cursos){
            System.out.printf("O aluno %s estuda %s\n",
                    aluno1,curso);
        }
        
        System.out.println(aluno1.cursos.get(0).alunos);
        System.out.println(curso1.alunos);
        System.out.println(curso1 + "\n");
        
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
        
        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado);
            System.out.println(cursoEncontrado.alunos);
        }
        
        
    }
}
