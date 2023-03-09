/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luist
 */
public class Lista {
    
    public static void main(String[] args) {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        
        Usuario u1 = new Usuario("Ana");
        
        listaUsuarios.add(u1);
        listaUsuarios.add(new Usuario("Carlos"));
        listaUsuarios.add(new Usuario("Lia"));
        listaUsuarios.add(new Usuario("Bia"));
        listaUsuarios.add(new Usuario("Bia"));
        listaUsuarios.add(new Usuario("Takeo"));
        listaUsuarios.add(new Usuario("Edith"));
        
        System.out.println(listaUsuarios.get(3));
        //acessar pelo indice
        
        System.out
                .println(listaUsuarios.remove(1)
                );//esse retorna ainda o toString
        System.out
                .println("Removido? " + listaUsuarios
                        .remove(new Usuario("Lia")
                        )
                );// esse retorna true ou false
        
        System.out
                .println("Tem? " + 
                        listaUsuarios.contains(new Usuario("Lia")
                        )
                );
        
        for(Usuario user: listaUsuarios){
            System.out.println(user);
        }
        
    }
}
