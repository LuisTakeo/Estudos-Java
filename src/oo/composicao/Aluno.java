/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

import java.util.ArrayList;

/**
 *
 * @author luist
 */
public class Aluno {
    
    final String nomeAluno;
    
    final ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    Aluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    
    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    
    void removerCurso(Curso curso){
        this.cursos.remove(curso);
        curso.alunos.remove(this);
    }
    
    Curso obterCursoPorNome(String nome){
        
        for(Curso curso: this.cursos){
            if(curso.nomeCurso
                    .equalsIgnoreCase(nome)
                    ){
                return curso;
            }
        }
        
        return null;
    }
    
    public String toString() {
        return this.nomeAluno;
    }
    
}
