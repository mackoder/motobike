package motobike.core.tests;

import motobike.core.BicycleRental;
import motobike.core.Rental;
import motobike.dao.BicycleDAO;
import motobike.model.tests.TestingDataset;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BicycleRentalTest {

	private final BicycleDAO dao = new BicycleDAO();
	
	@Before
	public void setUp() {
		TestingDataset.addBicycles(dao);
	}
	
	@Test
	public void testRental() {
		assertTrue(dao.size() > 1);

		Rental rental = new BicycleRental();
		rental.rent(dao.read(1));
	}
}
