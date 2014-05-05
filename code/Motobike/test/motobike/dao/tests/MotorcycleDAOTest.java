package motobike.dao.tests;

import motobike.dao.MotorcycleDAO;
import motobike.model.Motorcycle;
import motobike.model.tests.TestingDataset;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MotorcycleDAOTest {
	private final MotorcycleDAO dao = MotorcycleDAO.get();

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
		final Motorcycle e1 = dao.read(1);
		e1.setMake("Acme");
		dao.update(e1);
		
		final Motorcycle e = dao.read(1);

		assertEquals(e.getMake(), "Acme");
		assertEquals(e.getModel(), e1.getModel());
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void deleteTest() {
		final Motorcycle e1 = dao.read(1);
		assertEquals(e1.getMake(), "Caloi");
		assertEquals(e1.getModel(), "1000");

		dao.delete(e1);
		dao.read(1);
	}
}
