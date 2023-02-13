package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana (de domingo a sabado):");
		String diaSemana = entrada.next().toLowerCase().trim();
		
		if(diaSemana.equals("domingo")) {
			System.out.printf("%s é dia 1", diaSemana);
			
		} else if(diaSemana.equals("segunda")) {
			System.out.printf("%s é dia 2", diaSemana);
			
		}else if(diaSemana.equals("terça") ||
				diaSemana.equals("terca")) {
			System.out.printf("%s é dia 3", diaSemana);
			
		}else if(diaSemana.equals("quarta")) {
			System.out.printf("%s é dia 4", diaSemana);
			
		}else if(diaSemana.equals("quinta")) {
			System.out.printf("%s é dia 5", diaSemana);
			
		}else if(diaSemana.equals("sexta")) {
			System.out.printf("%s é dia 6", diaSemana);
			
		}else if(diaSemana.equals("sábado") || 
				diaSemana.equals("sabado")) {
			System.out.printf("%s é dia 7", diaSemana);
		}else {
			System.out.println("Dia não existente.");
		}
		
		entrada.close();
	}
}
