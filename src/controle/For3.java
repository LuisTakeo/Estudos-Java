package controle;

public class For3 {
	public static void main(String[] args) {
		
		for(int valor1 = 1; valor1 <= 10; valor1++) {
			
			System.out.printf("Tabuada do %d: \n",valor1);
			
			for(int valor2 = 1; valor2 <= 10; valor2++) {
				int resultado = valor1 * valor2;
				System.out.printf("%d * %d = %d \n", valor1, valor2, resultado);
			}
			System.out.println("");
		}
	}
}
