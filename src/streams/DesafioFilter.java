/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author luist
 */
public class DesafioFilter {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(
                "Takeo", 31, true, false);
        Cliente c2 = new Cliente(
                "Edith", 31, true, true);
        Cliente c3 = new Cliente(
                "Cesar", 24, false, false);
        Cliente c4 = new Cliente(
                "Enzo", 17, true, false);        
        Cliente c5 = new Cliente(
                "Ana", 15, true, false);
        Cliente c6 = new Cliente(
                "Renan", 45, false, false);
        
        
        Predicate<Cliente> isMaiorDeIdade =
                cliente -> cliente.idade >= 18;
        Predicate<Cliente> isPossuiDesconto =
                cliente -> cliente.estudante || cliente.clubeAssinante;
        Function<Cliente, String> informaDesconto =
                cliente -> String.format(
                        "Boa noite %s, você tem direito a descontos no nosso bar!",
                        cliente.nome);
        
        List<Cliente> clientesRockBar = Arrays.asList(
                c1, c2, c3, c4, c5, c6);
        
        clientesRockBar.stream()
                .filter(isMaiorDeIdade)
                .filter(isPossuiDesconto)
                .map(informaDesconto)
                .forEach(System.out::println);
        
    }
}
