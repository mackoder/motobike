package motobike.model.tests;

import motobike.dao.VehicleDAO;
import motobike.model.Bicycle;
import motobike.model.Motorcycle;

public class TestingDataset {
	static public void addBicycles(final VehicleDAO dao) {
		final Bicycle e1 = new Bicycle();
		e1.setID(1); e1.setMake("Caloi"); e1.setModel("1000"); dao.add(e1);

		final Bicycle e2 = new Bicycle();
		e2.setID(2); e2.setMake("Caloi"); e2.setModel("2000"); dao.add(e2);

		final Bicycle e3 = new Bicycle();
		e3.setID(3); e3.setMake("Caloi"); e3.setModel("3000"); dao.add(e3);
	}

	static public void addMotorcycles(final VehicleDAO dao) {
		final Motorcycle e1 = new Motorcycle();
		e1.setID(1001); e1.setMake("Honda"); e1.setModel("Bis"); dao.add(e1);

		final Motorcycle e2 = new Motorcycle();
		e2.setID(1002); e2.setMake("Honda"); e2.setModel("CG125"); dao.add(e2);

		final Motorcycle e3 = new Motorcycle();
		e3.setID(1002); e3.setMake("Honda"); e3.setModel("Falcon"); dao.add(e3);
	}
}
