package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia\n\n");
		
		System.out.println("Bom");
		System.out.println("Dia");
		int valor = 1, idade;
		double salario;
		String nome;
		
		System.out.printf("Megasena %d %d %d %d %d %n", valor, 
				2, 3, 4, 5);
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		entrada.nextLine();
		
//		System.out.println("Digite a sua renda: ");
//		salario = entrada.nextDouble();
//		entrada.nextLine();
		
		System.out.printf(
				"Nome: %s %nIdade: %d anos %n", 
				nome, idade);
		
		entrada.close();
	}
}
