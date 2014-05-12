package motobike.model;

import motobike.model.detail.FuelType;

public class Motorcycle extends Vehicle {
	private FuelType fuel;
	private String licensePlate;
	private int milage;

	public FuelType getFuel() {
		return fuel;
	}

	public void setFuel(FuelType fuel) {
		this.fuel = fuel;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}
}
