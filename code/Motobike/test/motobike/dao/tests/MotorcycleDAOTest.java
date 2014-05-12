package motobike.dao.tests;

import motobike.dao.MotorcycleDAO;
import motobike.model.Motorcycle;
import motobike.model.tests.TestingDataset;
import org.junit.Test;
import static org.junit.Assert.*;

public class MotorcycleDAOTest {

	@Test
	public void updateTest() {
		final MotorcycleDAO dao = MotorcycleDAO.get();
		TestingDataset.addBicycles(dao);
		TestingDataset.addMotorcycles(dao);

		final Motorcycle e1 = dao.read(1001);
		e1.setMake("Acme");
		dao.update(e1);
		
		final Motorcycle e = dao.read(1001);

		assertEquals(e.getMake(), "Acme");
		assertEquals(e.getModel(), e1.getModel());
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void deleteTest() {
		final MotorcycleDAO dao = MotorcycleDAO.get();
		TestingDataset.addBicycles(dao);
		TestingDataset.addMotorcycles(dao);

		final Motorcycle e1 = dao.read(1001);
		assertEquals(e1.getModel(), "Bis");

		dao.delete(e1);
		dao.read(1001);
	}
}
