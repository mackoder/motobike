package motobike.dao;

import motobike.model.Bicycle;

public class BicycleDAO extends GenericDAO<Bicycle> {
	// Horrivel, mas sem definicao de projeto ainda...
	static private final BicycleDAO singletonInstance = new BicycleDAO();
	static public BicycleDAO get() {
		return singletonInstance;
	}
}
