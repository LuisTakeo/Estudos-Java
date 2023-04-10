/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.List;

/**
 *
 * @author luist
 */
public class ListaUtil {
    
    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size() - 1);
    }
    
    public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size() - 1);
    }
    
    public static <A, B, C> C teste(A paramA, B paramB) {
        C teste = null;
        return teste;
    }
    
}
