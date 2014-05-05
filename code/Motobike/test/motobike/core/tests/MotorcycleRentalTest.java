package motobike.core.tests;

import motobike.core.MotorcycleRental;
import motobike.core.Rental;
import motobike.dao.MotorcycleDAO;
import motobike.model.tests.TestingDataset;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MotorcycleRentalTest {

	private final MotorcycleDAO dao = new MotorcycleDAO();
	
	@Before
	public void setUp() {
		TestingDataset.addMotorcycles(dao);
	}
	
	@Test
	public void testRental() {
		assertTrue(dao.size() > 1);

		Rental rental = new MotorcycleRental();
		rental.rent(dao.read(1001));
	}
}
