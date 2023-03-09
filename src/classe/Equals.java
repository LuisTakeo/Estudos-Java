/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.Date;

/**
 *
 * @author luist
 */
public class Equals {
    
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Luis Takeo";
        u1.email = "luistakeo@outlook.com";
        
        Usuario u2 = new Usuario();
        u2.nome = "Luis Takeo";
        u2.email = "luistakeo@outlook.com";
        
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        
        System.out.println(u2.equals(new Date()));    
                
    }
}
