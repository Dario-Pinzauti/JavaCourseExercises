package netstudio.oop.parking2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Garage {
	
	private String name;
	private long rate;
	private List<Car> cars;
	public Garage(String name, long rate) {
		super();
		this.name = name;
		this.rate = rate;
		this.cars =  new ArrayList<>();
	}
	
	
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	
	public void removeCar(String plate) {		
		cars.remove(getCarByPalate(plate));
	}
	
	
	
	public long carPay(String plate) {
		Car c = getCarByPalate(plate);
		
		long time  = c.getParkingTime().until(LocalDateTime.now(),ChronoUnit.HOURS);  
		
		return time * rate;
		 
	}
	
	
	private Car getCarByPalate(String plate) {
		for (Car car : cars) {
			if(car.getPlate().equals(plate)) {
				return car;
			}	
		}
		
		return null;
	}
	
	public List<Car> getAllCars(){
		return cars;
	}
	

	
	

}
