package motobike.dao.tests;

import motobike.dao.VehicleDAO;
import motobike.model.Vehicle;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleDAOTest {
	@Test
	public void addAndReadTest() {
		VehicleDAO<Vehicle> dao = new VehicleDAO<Vehicle>();

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
		VehicleDAO<Vehicle> dao = new VehicleDAO<Vehicle>();

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
		VehicleDAO<Vehicle> dao = new VehicleDAO<Vehicle>();

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
