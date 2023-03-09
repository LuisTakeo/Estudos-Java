package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data nascimentoTakeo = new Data();
		nascimentoTakeo.dia = 6;
		nascimentoTakeo.mes = 9;
		nascimentoTakeo.ano = 1991;
		
		System.out
		.printf("Sua data de nascimento � %d/%d/%d", 
				nascimentoTakeo.dia, 
                                nascimentoTakeo.mes, 
				nascimentoTakeo.ano);
		
	}
}
