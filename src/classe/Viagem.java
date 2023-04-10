/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author luist
 */
public class Viagem {
    
    String destino;
    String corDaMala;
    String horaVoo;
    double pesoBagagem;

    public Viagem(String destino, String corDaMala, String horaVoo, double pesoBagagem) {
        this.destino = destino;
        this.corDaMala = corDaMala;
        this.horaVoo = horaVoo;
        this.pesoBagagem = pesoBagagem;
    }
    
    Viagem(){}    
        
    void informaViagem(){
        System.out.printf(
                "A viagem tem destino %s as %s, cor da bagagem %s e peso %.2fkg \n",
                this.destino, this.horaVoo, 
                this.corDaMala, this.pesoBagagem
        );
    }
    
    
}
