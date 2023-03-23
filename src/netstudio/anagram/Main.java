package netstudio.anagram;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	String firstWord = sc.next();
	 	String secondWord = sc.next();
	 	
		
		if(firstWord.length() != secondWord.length()) {
			System.out.println("false");
			return; 
		}
		
		for (int i = 0; i < firstWord.length(); i++) {
			char charAt = firstWord.charAt(i);
			int frequencyFirst = 0;
			int frequencySecond = 0;
			for (int j = 0; j < firstWord.length(); j++) {
				if(firstWord.charAt(j)== charAt)
					frequencyFirst ++;
				if(secondWord.charAt(j)== charAt)
					frequencySecond ++;
			}
			if(frequencyFirst != frequencySecond) {
				System.out.println("false");
				return;
				
			}
						
		}
		System.out.println("true");
		
		
	}

}
