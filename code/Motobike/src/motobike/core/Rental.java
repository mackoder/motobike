package motobike.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import motobike.model.Vehicle;

public abstract class Rental {
	protected Date rentalDate;
	protected Date returnDate;
	protected Vehicle vehicle;
	
	public static long calcDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}
	
	public void rent(final Vehicle vehicle) {
		System.out.println("Common Rental details here...");		
		vehicle.setAvailable(false);
	}

	abstract public double totalDue();
}
