package motobike.core;

import java.util.concurrent.TimeUnit;
import motobike.model.Motorcycle;
import motobike.model.Vehicle;

public class MotorcycleRental extends Rental {
	static private final MotorcycleRental singletonInstance = new MotorcycleRental();
	static public MotorcycleRental get() {
		return singletonInstance;
	}

	private int initialMilage;
	
	@Override
	public void rent(final Vehicle vehicle) {
		super.rent(vehicle);
		initialMilage = ((Motorcycle)vehicle).getMilage();
	}

	@Override
	public double totalDue() {
		final long days = calcDateDiff(rentalDate, returnDate, TimeUnit.DAYS);
		final int kms = ((Motorcycle)vehicle).getMilage() - initialMilage;
		final double price = ((Motorcycle)vehicle).getTimeUnitPrice();
		return days * price + kms * price;
	}
}
