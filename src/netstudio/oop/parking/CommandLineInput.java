package netstudio.oop.parking;

import java.util.Scanner;

public final class CommandLineInput {
	private static CommandLineInput instance;
	public Scanner sc;
	
	  private CommandLineInput(Scanner sc) {
	        this.sc = sc;
	    }

	    public static Scanner getInstance() {
	        if (instance == null) {
	            instance = new CommandLineInput(new Scanner(System.in));
	        }
	        return instance.sc;
	    }
	
	
	

}
