package netstudio.oop.exceptions;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.pippo.Example");
		} catch (ClassNotFoundException e) {
			
			System.out.println("class not found");
		}
			
		
		
		Integer pippo = null;
		
		System.out.println(pippo.toString());

	}

}
