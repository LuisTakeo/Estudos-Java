package fundamentos;

public class CelsiusToFarenheit {
	public static void main(String[] args) {
		final double divisor = 5 / 9.0;
		System.out.println(divisor);
		double farenheit = 170;
		double celsius = (farenheit - 32) * divisor;
		System.out.println("O valor em celsius é de " + celsius + " graus.");

	}
}
