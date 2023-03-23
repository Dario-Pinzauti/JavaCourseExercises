package netstudio.oop.comparable;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Mela [] mele = new Mela[5];
		
		mele[0] =new Mela(0, "golden");
		mele[1] =new Mela(10, "granny");
		mele[2] =new Mela(2, "stark");
		mele[3] =new Mela(6, "royal");
		mele[4] =new Mela(8, "fuji");
		
		
		

		
		printArray("Before Sorting", mele); 
		
		Arrays.sort(mele);
		
		printArray("After sorting: " ,mele);	
		
		
	}
	
	
	public static void printArray(String text , Mela[] mele) {
		System.out.println(text);	
		for (Mela mela : mele) {
			System.out.print(mela.getGrammi());	

		}
		
		System.out.println("");
		
	}
	


}


