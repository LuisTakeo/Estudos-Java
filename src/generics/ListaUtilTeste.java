/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author luist
 */
public class ListaUtilTeste {
    public static void main(String[] args) {
        
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3 ,4 , 5 , 6);
        
        String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem1);
        
        Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero1);
        
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);
        
        Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNumero2);
    }
}
