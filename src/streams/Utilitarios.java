/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.function.UnaryOperator;

/**
 *
 * @author luist
 */
public interface Utilitarios {
    
    public final static UnaryOperator<String> primeiraLetra = 
            nome -> nome.charAt(0) + "";
    public final static UnaryOperator<String> letraMaiuscula = 
            nome -> nome.toUpperCase();
    public static String grito(String nome){
        return nome.toUpperCase() + "!!!";
    };


}
