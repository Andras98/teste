package pt.com.everis.academia.java;

public class BooksMain {

	public static void main(String[] args) {
		Book book1 = new Book("teste");
		Book book2 = new Book("teste");
		System.out.println(book1.equals(book2));
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
