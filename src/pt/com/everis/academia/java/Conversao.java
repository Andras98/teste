package pt.com.everis.academia.java;

public class Conversao {

	public static void main(String[] args) {
		long x = 10000000000010010L;
		int a = (int) x;
		double c = a;
		System.out.println(x);
		System.out.println(a);
		System.out.println(c);
		float l = (float) 0.0;
		System.out.println(l);
		Boolean asd = new Boolean("true");
		System.out.println(asd);
		byte b = 100;
		System.out.println();
		Double double1 = new Double(1.1);
		System.out.println(double1.byteValue());
		System.out.println(double1.doubleValue());
		System.out.println(double1.floatValue());
		System.out.println(double1.intValue());
		System.out.println(double1.longValue());
		System.out.println(double1.shortValue());
	}

}
