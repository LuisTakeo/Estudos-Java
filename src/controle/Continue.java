package controle;

public class Continue {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
				//o continue s� interrompe essa repeti��o para a proxima
			}
			System.out.println(i);
		}
	}

}
