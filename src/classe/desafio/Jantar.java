/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.desafio;

/**
 *
 * @author luist
 */
public class Jantar {
    public static void main(String[] args) {
        Comida janta1 = new Comida("Pizza", .4);
        Comida janta2 = new Comida("Pão de queijo", .2);
        Pessoa cliente1 = new Pessoa("Takeo", 60.5);
        
        System.out.println(cliente1.apresentar());
        cliente1.comer(janta1);
        System.out.printf(
                "%s comeu uma %s e agora está com %.2f kilos\n", 
                cliente1.nome, janta1.nomeComida, cliente1.peso);
        
        cliente1.comer(janta2);
        System.out.println(cliente1.apresentar());
        
                
    }
         
}
