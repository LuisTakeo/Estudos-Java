package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean comprouTV50 = 
				trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = 
				trabalhoTerca ^ trabalhoQuinta;
		boolean tomouSorvete = 
				trabalhoTerca || trabalhoQuinta;
		boolean saudavel = !tomouSorvete;
		
		System.out.println(
				"Comprou TV 50\"?" + comprouTV50);
		System.out.println(
				"Comprou TV 32\"?" + comprouTV32);
		System.out.println(
				"Tomou sorvete?" + tomouSorvete);
		System.out.println(
				"Ficou saudavel? " + saudavel);
	}
}
