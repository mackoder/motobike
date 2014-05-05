package motobike.dao;

import motobike.model.Motorcycle;

public class MotorcycleDAO extends VehicleDAO<Motorcycle> {
	// Horrivel, mas sem definicao de projeto ainda...
	static private final MotorcycleDAO singletonInstance = new MotorcycleDAO();
	static public MotorcycleDAO get() {
		return singletonInstance;
	}
}
