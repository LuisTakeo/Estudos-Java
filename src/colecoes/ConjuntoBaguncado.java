/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author luist
 */
public class ConjuntoBaguncado {
    
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();
        
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); // conversão auto
        conjunto.add('x');
        
        System.out.printf("O tamanho é %d \n", 
                conjunto.size());
        conjunto.add("teste");
        conjunto.add('x');
        System.out.printf("O tamanho é %d \n", 
                conjunto.size());
        
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove('x'));
        
        System.out.printf("O tamanho é %d \n", 
                conjunto.size());
        
        System.out
                .println(conjunto
                        .contains('x'));
        System.out
                .println(conjunto
                        .contains(1));
        System.out
                .println(conjunto
                        .contains(true));
        
        Set nums = new HashSet();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        System.out.println(nums);
        System.out.println(conjunto);
        
        //conjunto.addAll(nums);//união entre 2 conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        
        conjunto.clear();
        System.out.println(conjunto);
    }
}
