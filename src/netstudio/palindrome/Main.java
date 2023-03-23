package netstudio.palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	String word = sc.next();
	 	
		char[] charArray = word.toCharArray();
		
		int length = charArray.length/2;
		for (int i = 0; i < length; i++) {
				if(charArray[i] != charArray[charArray.length-1-i]) {
					System.out.println("false");
					return;
				}
			
		}
		
		System.out.println("true");
	 	
	}

	
}


