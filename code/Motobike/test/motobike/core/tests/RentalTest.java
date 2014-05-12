package motobike.core.tests;

import motobike.core.BicycleRental;
import motobike.core.Rental;
import motobike.dao.GenericDAO;
import motobike.model.Vehicle;
import motobike.model.tests.TestingDataset;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RentalTest {

	private final GenericDAO dao = new GenericDAO();
	
	@Before
	public void setUp() {
		TestingDataset.addBicycles(dao);
		TestingDataset.addMotorcycles(dao);
	}
	
	@Test
	public void testRental() {
		assertTrue(dao.size() > 1);
		
		Rental rental = new BicycleRental(); // Can't test directly...
		//rental.rent(dao.read(1));
		
		Vehicle v = (Vehicle)dao.read(1);
		assertTrue(v.isAvailable());
		rental.rent(v);
		assertFalse(v.isAvailable());

		dao.update(v);

		Vehicle v2 = (Vehicle)dao.read(1);
		assertFalse(v2.isAvailable());
	}


}
