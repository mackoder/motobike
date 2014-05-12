package motobike.dao;

import motobike.model.Motorcycle;

public class MotorcycleDAO extends GenericDAO<Motorcycle> {
	static private final MotorcycleDAO singletonInstance = new MotorcycleDAO();
	static public MotorcycleDAO get() {
		return singletonInstance;
	}
}
