package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4.5;
		String resultadoRecuperacao = media >= 5.0 ?
				"em recuperação" : "reprovado";							
				
		String resultadoFinal = media >= 7.0 ?
				"aprovado" : resultadoRecuperacao;
		
		System.out.printf("O aluno está %s \n", resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String mensagemDesconto = temDesconto ? "Sim " : "Não";
		System.out.printf("Tem desconto? %s", mensagemDesconto);
	}
}
