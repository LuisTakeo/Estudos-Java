package controle;

public class ContinueRotulado {
	
	public static void main(String[] args) {
		// n�o recomend�vel utilizar esse break
		externo: 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i==1) {
					continue externo;
				}
				System.out
				.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
	}
}
