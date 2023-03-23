package netstudio.oop.library;

public class Book {
	private String title;
	private String author;
	private int price;

	public Book(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}

	public Book(Book l) {
		title = l.getTitle();
		author = l.getAuthor();
		price = l.getPrice();
	}// costruttore di copia non richiesto ma implementato perchè usato nella classe
		// Libreria

	public String getTitle() {
		return title;
	}// non richiesto ma implementato perchè usato nel costruttore di copia

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

}
