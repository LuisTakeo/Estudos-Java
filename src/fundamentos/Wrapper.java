package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100; 
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.nextLine());
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123F;//float
		System.out.println(f);
		
		Double d = 444.32;//double
		System.out.println(d);
				
		Boolean bo = Boolean.parseBoolean("true");//boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		System.out.println(c + "...");
		
		
		entrada.close();
	}
}
