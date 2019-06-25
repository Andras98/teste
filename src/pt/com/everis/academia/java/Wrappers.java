package pt.com.everis.academia.java;

public class Wrappers {
	public static void main(String[] args) {
		Integer i = new Integer(125);
		Integer j = i;
		System.out.println(i==j);
		i = i + 1;
		i = i - 1;
		j = j + 1;
		j = j - 1;
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println(i == j);
		Object o = new Object();
	}
}
