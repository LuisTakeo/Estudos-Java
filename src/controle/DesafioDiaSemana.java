package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana (de domingo a sabado):");
		String diaSemana = entrada.next().toLowerCase().trim();
		
		if(diaSemana.equals("domingo")) {
			System.out.printf("%s � dia 1", diaSemana);
			
		} else if(diaSemana.equals("segunda")) {
			System.out.printf("%s � dia 2", diaSemana);
			
		}else if(diaSemana.equals("ter�a") ||
				diaSemana.equals("terca")) {
			System.out.printf("%s � dia 3", diaSemana);
			
		}else if(diaSemana.equals("quarta")) {
			System.out.printf("%s � dia 4", diaSemana);
			
		}else if(diaSemana.equals("quinta")) {
			System.out.printf("%s � dia 5", diaSemana);
			
		}else if(diaSemana.equals("sexta")) {
			System.out.printf("%s � dia 6", diaSemana);
			
		}else if(diaSemana.equals("s�bado") || 
				diaSemana.equals("sabado")) {
			System.out.printf("%s � dia 7", diaSemana);
		}else {
			System.out.println("Dia n�o existente.");
		}
		
		entrada.close();
	}
}
