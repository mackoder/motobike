package motobike.core;

import motobike.model.Vehicle;

public class BicycleRental extends Rental {
	@Override
	public void rent(final Vehicle vehicle) {
		super.rent(vehicle);
		System.out.println("Bicycle Rental details here...");
	}
}
