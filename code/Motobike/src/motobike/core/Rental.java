package motobike.core;

import motobike.model.Vehicle;

public abstract class Rental {
	public void rent(final Vehicle vehicle) {
		System.out.println("Common Rental details here...");		
		vehicle.setAvailable(false);
	}
}
