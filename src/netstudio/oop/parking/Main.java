package netstudio.oop.parking;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static Garage pippo ;
	
	public static void main(String[] args) {
		pippo = new Garage("pippo", 1);
		
		commandLine();
		System.out.println("bye bye...");
	}
	
	
	public static void commandLine() {	
		while(true) {
			System.out.println("1) add new car");
			System.out.println("2) get all cars");
			System.out.println("3) pay car by plate");
			System.out.println("4) exit");
			Integer i = CommandLineInput.getInstance().nextInt();
			
			switch (i) {
			case 1: {
				addNewCar();
				break;
			}
			case 2: {	
				getAllCars();
				break;
			}
			case 3: {	
				payCarByPlate();
				break;
			}
			case 4: {	
				return;
			}
			
			default:
				System.out.println(i + " is not a valid number");
			}
			
			
		}
		
	}


	private static void payCarByPlate() {
		System.out.println("Insert plate :");
		String plate = CommandLineInput.getInstance().next();
		
		long carPay = pippo.carPay(plate);
		System.out.println("the cost of parking is "+ carPay + " euro");
		pippo.removeCar(plate);
			
		
	}


	private static void getAllCars() {
		if(pippo.getAllCars().isEmpty()) {			
			System.out.println("the garage is empty");
			return;
		}
		
		for (Car car : pippo.getAllCars()) {
			System.out.println(car.toString());			
		}
		
		
	}


	private static void addNewCar() {
		
		System.out.println("ADD NEW CAR");
		System.out.println("Insert model :");
		String model = CommandLineInput.getInstance().next();
		System.out.println("Insert brand :");
		String brand = CommandLineInput.getInstance().next();
		System.out.println("Insert owner :");
		String owner = CommandLineInput.getInstance().next();
		System.out.println("Insert plate :");
		String plate = CommandLineInput.getInstance().next();
		
		pippo.addCar(new Car(model, brand, owner, plate, LocalDateTime.now()));
		
	}
	

}
