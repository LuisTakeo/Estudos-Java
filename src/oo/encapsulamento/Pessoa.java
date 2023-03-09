/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.encapsulamento;

/**
 *
 * @author luist
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;
    
    public Pessoa(String nome, String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    //atalho para getters setters alt-insert
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getNomeCompleto(){
        return String.format("%s %s", 
                getNome(), getSobrenome()
        );
    }
    // Getters
    public int getIdade(){
        return this.idade;
    }
    
    // Setters
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return String.format( "Olá eu sou %s e tenho %d anos.",
                getNome(), getIdade()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
