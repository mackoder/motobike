package motobike.core;

import java.util.concurrent.TimeUnit;
import static motobike.core.Rental.calcDateDiff;
import motobike.model.Bicycle;
import motobike.model.Vehicle;

public class BicycleRental extends Rental {
	static private final BicycleRental singletonInstance = new BicycleRental();
	static public BicycleRental get() {
		return singletonInstance;
	}

	@Override
	public void rent(final Vehicle vehicle) {
		super.rent(vehicle);
	}

	@Override
	public double totalDue() {
		final long hours = calcDateDiff(rentalDate, returnDate, TimeUnit.HOURS);
		final double price = ((Bicycle)vehicle).getTimeUnitPrice();
		return hours * price;
	}
}
