package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		}else if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}else if(media >= 0 && media < 4.5){
			System.out.println("Reprovado");
		}else{
			System.out.println("Nota inv�lida");
		};
		
		entrada.close();
	}
}
