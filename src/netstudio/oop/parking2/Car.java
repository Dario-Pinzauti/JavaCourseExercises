package netstudio.oop.parking2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Car {
	
	private String model;
	private String brand;
	private String owner;
	private String plate;
	private LocalDateTime parkingTime;
	
	
	
	public Car(String model, String brand, String owner, String plate, LocalDateTime parkingTime) {
		super();
		this.model = model;
		this.brand = brand;
		this.owner = owner;
		this.plate = plate;
		this.parkingTime = parkingTime;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public LocalDateTime getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(LocalDateTime parkingTime) {
		this.parkingTime = parkingTime;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + ", owner=" + owner + ", plate=" + plate + ", parkingTime="
				+ parkingTime + "]";
	}
	
	

		

}
