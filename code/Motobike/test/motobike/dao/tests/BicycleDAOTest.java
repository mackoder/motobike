package motobike.dao.tests;

import motobike.dao.BicycleDAO;
import motobike.model.Bicycle;
import motobike.model.tests.TestingDataset;
import org.junit.Test;
import static org.junit.Assert.*;

public class BicycleDAOTest {	
	@Test
	public void updateTest() {
		final BicycleDAO dao = BicycleDAO.get();
		TestingDataset.addBicycles(dao);
		TestingDataset.addMotorcycles(dao);

		final Bicycle e1 = dao.read(1);
		e1.setMake("Acme");
		dao.update(e1);
		
		final Bicycle e = dao.read(1);

		assertEquals(e.getMake(), "Acme");
		assertEquals(e.getModel(), e1.getModel());
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void deleteTest() {
		final BicycleDAO dao = BicycleDAO.get();
		TestingDataset.addBicycles(dao);
		TestingDataset.addMotorcycles(dao);

		final Bicycle e1 = dao.read(1);
		assertEquals(e1.getModel(), "1000");

		dao.delete(e1);
		dao.read(1);
	}
}
