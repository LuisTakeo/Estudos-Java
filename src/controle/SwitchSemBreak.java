package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
			case "preta":
				System.out
				.println("Sei o Bassai-Dai");
			case "marrom":
				System.out
				.println("Sei o Tekki Shodan");
			case "roxa":
				System.out
				.println("Sei o Heian Yodan");
			case "verde":
				System.out
				.println("Heian Sandan");
			case "laranja":
				System.out
				.println("Sei o Heian Nidan");
			case "vermelha":
				System.out
				.println("Sei o Heian Shodan");
			case "amarela":
				System.out.println();
				break;
			default:
				System.out.println("Não sei de nada");
		}
		
		System.out.println("Fim");
		
		int idade = 3;
		
		switch(idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe comer");
		default:
			System.out.println("Sabe respirar");
		}
	}
}
