package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double pi = 3.14159;
		//final define uma constante, que n�o vai ser mudado depois
		double area = pi * raio * raio;
		System.out.println(area);
		raio = 10;
		area = pi * raio * raio;
		System.out.println("�rea = " + area + "m2.");
	}
}
