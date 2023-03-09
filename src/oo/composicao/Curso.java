/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luist
 */
public class Curso {
    
    final String nomeCurso;   
    final List<Aluno> alunos = new ArrayList<>();
    
    Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    
    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
    
    public String toString(){
        return this.nomeCurso;
    }
    
}
