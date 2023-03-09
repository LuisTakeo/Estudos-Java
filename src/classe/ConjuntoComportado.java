/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author luist
 */
public class ConjuntoComportado {
    
    public static void main(String[] args) {
        
//        Set<String> listaAprovados = new HashSet<>();
        // podemos botar o tipo somente de um lado p/ simplificar
        SortedSet<String> listaAprovados = new TreeSet<>();
        //esse tipo de anotação <> se chama Generics
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Takeo");
        listaAprovados.add("Edith");
        listaAprovados.add("Edith");
        
        System.out.println(listaAprovados);
        
        for(String canditado: listaAprovados){
            System.out.println(canditado);
        }
        
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);
        
//        nums.getClass(1); //Não é possível acessar pelo indice
        
        System.out.println(nums);
        
        for(int n: nums){
            System.out.println(n);
        }
        
    }
}
