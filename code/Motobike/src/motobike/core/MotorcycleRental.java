package motobike.core;

import motobike.model.Vehicle;

public class MotorcycleRental extends Rental {
	@Override
	public void rent(final Vehicle vehicle) {
		super.rent(vehicle);
		System.out.println("Motorcycle Rental details here...");
	}
}
