package motobike.core.tests;

import motobike.core.MotorcycleRental;
import motobike.core.Rental;
import motobike.dao.BicycleDAO;
import motobike.dao.MotorcycleDAO;
import motobike.model.tests.TestingDataset;
import org.junit.Test;

public class MotorcycleRentalTest {

	@Test
	public void testRental() {
		final MotorcycleDAO dao = MotorcycleDAO.get();
		//TestingDataset.addBicycles(dao);
		TestingDataset.addMotorcycles(dao);

		Rental rental = new MotorcycleRental();
		rental.rent(dao.read(1001));
		
	}
}
