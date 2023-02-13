package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	
	public static void main(String[] args) {
		
		int valorA, valorB, resultado;
		String operador;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		valorA = entrada.nextInt();
		System.out.print("Insira um novo valor: ");
		valorB = entrada.nextInt();
		
		System.out.print("Qual operação deseja realizar? "
				+ "(+, -, *, /)");
		operador = entrada.next().trim();
		
		boolean soma = operador.equals("+");
		boolean subtracao = operador.equals("-");
		boolean multi = operador.equals("*");
		boolean divisao = operador.equals("/");
		
		String operadorTexto = soma ?
				"A soma" : subtracao ?
				"A subtração" : multi ?
				"A multiplicação" : divisao ?
				"A divisão" : "Não informado";
				
		
		resultado = soma ? 
				valorA + valorB : subtracao ? 
				valorA - valorB : multi ? 
				valorA * valorB : divisao ? 
				valorA / valorB : 0;
		
		System.out.printf("%s deu %d", operadorTexto, resultado);
		
		entrada.close();
	}
}
