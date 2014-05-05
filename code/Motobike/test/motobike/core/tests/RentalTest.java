package motobike.core.tests;

import motobike.core.BicycleRental;
import motobike.core.Rental;
import motobike.dao.BicycleDAO;
import motobike.dao.VehicleDAO;
import motobike.model.Vehicle;
import motobike.model.tests.TestingDataset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RentalTest {

	private final VehicleDAO dao = new VehicleDAO();
	
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
		
		Vehicle v = dao.read(1);
		assertTrue(v.isAvailable());
		rental.rent(v);
		assertFalse(v.isAvailable());

		dao.update(v);

		Vehicle v2 = dao.read(1);
		assertFalse(v2.isAvailable());
	}


}
