package netstudio.oop.library;

import java.util.ArrayList;

/**
 * 
 * @author pinzauti
 *
 *Scrivere una classe Libro che rappresenti le seguenti informazioni relative ad un libro:
 *titolo, autore, prezzo, e che contenga il costruttore 
 *parametrizzato ed i metodi getTitolo, getAutore e getPrezzo che restituiscono rispettivamente il titolo, l'autore e il prezzo del libro. 
 *Scrivere poi una classe Libreria, che rappresenti un insieme di libri tramite un arrayList di tipo Libro, 
 *e che contenga il costruttore parametrizzato ed un metodo trova che accetta in ingresso un autore a e intero k e restituisce 
 *il numero di libri contenuti nella libreria aventi autore e prezzo superiore a k. 

 *
 */
public class Library {

	private ArrayList<Book> books;

	public Library(ArrayList<Book> books) {
		this.books = books;
	}

	public int Find(String a, int k) {
		int cont = 0;
		for (int i = 0; i <= books.size(); i++)
			if (books.get(i).getAuthor().equals(a) && books.get(i).getPrice() > k)
				cont++;
		return cont;
	}

	
	//Aggiungere alla classe Libreria un metodo che accetti un autore a e restituisca i titoli di tutti i libri scritti dall’autore a. 

	public String[] findBooks(String a) {
		String[] result;
		int cont = 0;
		for (int i = 0; i < books.size(); i++)
			if (books.get(i).getAuthor().equals(a))
				cont++;
		result = new String[cont];
		cont = 0;
		for (int i = 0; i < books.size(); i++)
			if (books.get(i).getAuthor().equals(a)) {
				result[i] = books.get(i).getTitle();
				cont++;
			}
		return result;
	}

}
