package netstudio.oop.library;

import java.util.ArrayList;
import java.util.Scanner;

import netstudio.oop.parking.CommandLineInput;

public class Main {
	
	public static void main(String[] args) {
		//inizializziamo la libreria
		 ArrayList<Book> arrayList = new ArrayList<Book>();
		 arrayList.add(new Book("ORGOGLIO E PREGIUDIZIO", "Jane Austen", 10));
		 arrayList.add(new Book("IL SIGNORE DEGLI ANELLI", "J.R.R Tolkien", 20));
		 arrayList.add(new Book("IL PROFETA", " Kahlil Gibran", 2));
		 arrayList.add(new Book("Un Bel Libro", "auth thore", 5));
		 arrayList.add(new Book("Un Bel Libro 2", "auth thore", 50));
		 
		 Library library = new Library(arrayList);
		
		 Scanner sc = new Scanner(System.in);
		System.out.println("inserire autore");
		String autore = sc.next();
		System.out.println("inserire prezzo");
		int price = sc.nextInt();
		int pippo = library.Find(autore, price );
		
		System.out.println(pippo);
		
	}

}
