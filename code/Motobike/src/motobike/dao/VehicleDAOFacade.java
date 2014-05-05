package motobike.dao;

import motobike.model.Bicycle;
import motobike.model.Motorcycle;

public class VehicleDAOFacade {
	public void addBicycle(final Bicycle bicycle) {
		BicycleDAO.get().add(bicycle);
	}
	
	public void addMotorcycle(final Motorcycle motorcycle) {
		MotorcycleDAO.get().add(motorcycle);
	}
}
