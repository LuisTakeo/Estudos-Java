package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Pode se pronunciar: ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("sair"));
		
		entrada.close();
	}
}
