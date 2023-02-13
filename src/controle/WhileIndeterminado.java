package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		while(!texto.equalsIgnoreCase("sair")) {
			
			System.out.print("Digite alguma coisa: \n");
			texto = entrada.nextLine();
			texto = texto.trim();
		
		}
		
		entrada.close();
	}
}
