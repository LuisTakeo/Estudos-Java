/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.encapsulamento;

/**
 *
 * @author luist
 */
public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Luis Henrique Takeo", "Paim Yuahasi",-30);
        p1.setIdade(230); //alterar valor
        
        System.out.println(p1.getIdade()); //ler valor
        System.out.println(p1);
        System.out.println(p1.getNomeCompleto());
    }
}
