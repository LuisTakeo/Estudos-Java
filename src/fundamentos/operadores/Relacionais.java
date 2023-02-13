package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		// cada letra tem consigo o valor de um numero em unicode
		// não é recomendavel utilizar isso
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		System.out.println();
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println(
				"Tem desconto? " + temDesconto);
	}
}
