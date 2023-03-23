package netstudio.corso.variabili;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		
		
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("pippo", "123876837468");
		m.containsKey("pippo");
		m.put("pippo", "123876837");
		
		System.out.println(m.get("pippo"));
		
		
		
		
		

	}
	
	
	class Test{
		private int prova = 1;
		public int prova2 = 1;
		public Test(int prova, int prova2) {
			super();
			this.prova = prova;
			this.prova2 = prova2;
		}
		public int getProva() {
			return prova;
		}
		public void setProva(int prova) {
			this.prova = prova;
		}
		public int getProva2() {
			return prova2;
		}
		public void setProva2(int prova2) {
			this.prova2 = prova2;
		}
		
		
		
	}

}
