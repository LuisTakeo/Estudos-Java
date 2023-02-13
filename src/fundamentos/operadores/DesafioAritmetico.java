package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		//
		int conta1a = 6 * (3 + 2);
		System.out.println(conta1a);
		int conta1b = (int) Math.pow(conta1a, 2);
		int conta1c = conta1b / (3 * 2);
		System.out.println(conta1c);
		
		int conta2a = ((1 - 5) * (2 - 7)) / 2;
		System.out.println(conta2a);
		int conta2b = (int) Math.pow(conta2a, 2);
		
		int conta3a = conta1c - conta2b;
		conta3a = (int) Math.pow(conta3a, 3);
		System.out.println(conta3a);
		int conta3b = (int) Math.pow(10, 3);
		
		int resFinal = conta3a / conta3b;
		
		System.out.println(resFinal);
	}
}
