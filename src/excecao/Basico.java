/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

/**
 *
 * @author luist
 */
public class Basico {
    
    public static void main(String[] args) {
        
        Aluno a1 = null;
        
        try{
            imprimirAluno(a1);
        }catch(Exception err){
            System.out.println("Ocorreu algum erro ao imprimir o nome do usuário");
        }
        // atalho surround with: alt-enter
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        
        System.out.println("fim");
    }
    
    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
