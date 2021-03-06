package motobike.uc.tests;

import motobike.dao.GenericDAO;
import motobike.model.Vehicle;
import motobike.model.tests.TestingDataset;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class VehicleCRUDTest {
	@Test
	public void addAndReadTest() {
		GenericDAO<Vehicle> dao = new GenericDAO<Vehicle>();

		Vehicle e0 = new Vehicle();
		e0.setID(1);
		e0.setMake("Caloi");
		e0.setModel("1000");
		dao.add(e0);

		Vehicle e1 = dao.read(1);
		assertEquals(e1.getMake(),  e0.getMake());
		assertEquals(e1.getModel(), e0.getModel());
	}
	
	@Test
	public void updateTest() {
		GenericDAO<Vehicle> dao = new GenericDAO<Vehicle>();

		Vehicle e0 = new Vehicle();
		e0.setID(1);
		e0.setMake("Caloi");
		e0.setModel("1000");
		dao.add(e0);

		Vehicle e1 = dao.read(1);
		assertEquals(e1.getMake(),  e0.getMake());
		assertEquals(e1.getModel(), e0.getModel());
		
		e1.setMake("Newmake");
		e1.setModel("Newmodel");
		dao.update(e1);
		
		Vehicle e2 = dao.read(1);
		assertEquals(e2.getMake(), "Newmake");
		assertEquals(e2.getModel(), "Newmodel");
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void deleteTest() {
		GenericDAO<Vehicle> dao = new GenericDAO<Vehicle>();

		Vehicle e0 = new Vehicle();
		e0.setID(1);
		e0.setMake("Caloi");
		e0.setModel("1000");
		dao.add(e0);

		Vehicle e1 = dao.read(1);
		assertEquals(e1.getMake(),  e0.getMake());
		assertEquals(e1.getModel(), e0.getModel());

		dao.delete(e1);
		dao.read(1);
	}
}
