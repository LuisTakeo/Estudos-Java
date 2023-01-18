package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es de funciionario
		
		//tipos de n�meros inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = true; //false
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�meros de viagem
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha " + salario + " reais.");
		
		System.out.println("F�rias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
	}
}
