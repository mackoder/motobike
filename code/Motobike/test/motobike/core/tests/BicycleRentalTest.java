package motobike.core.tests;

import motobike.core.BicycleRental;
import motobike.core.Rental;
import motobike.dao.BicycleDAO;
import motobike.model.tests.TestingDataset;
import org.junit.Test;

public class BicycleRentalTest {
	
	@Test
	public void testRental() {
		final BicycleDAO dao = new BicycleDAO();
		TestingDataset.addBicycles(dao);

		Rental rental = new BicycleRental();
		rental.rent(dao.read(1));
	}
}
