package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.toUpperCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Luis Henrique Takeo";
		var sobrenome = "Paim Yuahasi";
		var idade = 31;
		var salario = 1200.00;
		
		System.out.printf("Nome: %s %s", nome, sobrenome);
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 11));
		
		
		String texto2 = "Teste";
		System.out.println(texto2.toUpperCase().concat(" bolo").length());
	}
}
