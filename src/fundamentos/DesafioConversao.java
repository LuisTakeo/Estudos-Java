package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String funcionario, salario1, salario2, salario3;
		double salarioValor1, salarioValor2, salarioValor3, media;
		
		
		System.out.println(
				"Digite seu nome: ");
		funcionario = leitor.nextLine();
		System.out.println(
				"Digite o seu último salário: ");
		salario1 = leitor.nextLine();
		System.out.println(
				"Digite o seu penúltimo salário: ");
		salario2 = leitor.nextLine();
		System.out.println(
				"Digite o seu antepenúltimo salário: ");
		salario3 = leitor.nextLine();
		
		salarioValor1 = Double.parseDouble(
				salario1.replace(",", "."));
		salarioValor2 = Double.parseDouble(
				salario2.replace(",", "."));
		salarioValor3 = Double.parseDouble(
				salario3.replace(",", "."));
		media = (salarioValor1 + salarioValor2 + salarioValor3) / 3;
		
		System.out.printf(
				"A média de ganhos de %s foi de %.2f reais", 
				funcionario, media);
		
		leitor.close();
	}
}
