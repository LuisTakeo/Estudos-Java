/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author luist
 */
public class ViagemTeste {
    public static void main(String[] args) {
        
        Viagem v1 = new Viagem();
        v1.destino = "Grécia";
        v1.corDaMala = "Rosa";
        v1.horaVoo = "4am";
        v1.pesoBagagem = 30;
        
        System.out.println("Informações viagem 1: ");
        
        v1.informaViagem();
        
        
        Viagem v2 = new Viagem();
        v2.destino = "Itália";
        v2.corDaMala = "Vermelha";
        v2.horaVoo = "12pm";
        v2.pesoBagagem = 20.00;
        
        System.out.println("\nInformações viagem 2: ");
        
        v2.informaViagem();
        
        Viagem v3 = new Viagem(
                "Japão", "Roxo", 
                "11am", 10);
        
        System.out.println("\nInformações viagem 3: ");
        v3.informaViagem();
        
        
    }
}
