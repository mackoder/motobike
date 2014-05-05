package motobike.dao.tests;

import motobike.dao.BicycleDAO;
import motobike.model.Bicycle;
import motobike.model.tests.TestingDataset;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class BicycleDAOTest {
	private final BicycleDAO dao = BicycleDAO.get();

	@Before
	public void setUp() {
		TestingDataset.addBicycles(dao);
		TestingDataset.addMotorcycles(dao);
	}

	@After
	public void setDown() {
	}
	
	@Test
	public void updateTest() {
		final Bicycle e1 = dao.read(1001);
		e1.setMake("Acme");
		dao.update(e1);
		
		final Bicycle e = dao.read(1001);

		assertEquals(e.getMake(), "Acme");
		assertEquals(e.getModel(), e1.getModel());
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void deleteTest() {
		final Bicycle e1 = dao.read(1001);
		assertEquals(e1.getMake(), "Honda");
		assertEquals(e1.getModel(), "Bis");

		dao.delete(e1);
		dao.read(1);
	}
}
