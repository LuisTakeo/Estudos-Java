package controle;

import java.util.Scanner;

public class DesafioClass {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0, total = 0, media;
		int notasRegistradas = 0, contador = 1;
		boolean notaErrada = true;
		
		while(nota != -1) {
			
			do {
				
				System.out.printf("Insira a %dª nota ou digite -1 para sair: ", 
					contador);
				nota = entrada.nextDouble();
				
				if(nota >= 0 && nota <= 10) {
					contador++;
					notasRegistradas++;
					total += nota;
					notaErrada = false;	
				}else if(nota == -1) {
					notaErrada = false;
				}else {
					System.out.println("\nNota inválida.");
				}
				
			}while(notaErrada);
			
		}
		if(notasRegistradas > 0) {
			media = total / notasRegistradas;
			System.out.printf("A média das %d notas é de %.2f pontos", 
					notasRegistradas, media);
		}else {
			System.out.println("Não foram registradas notas.");
		}
		
		entrada.close();
	}
}
