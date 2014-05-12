package motobike.dao;

import motobike.model.Motorcycle;

public class PersonDAO extends GenericDAO<Motorcycle> {
	static private final PersonDAO singletonInstance = new PersonDAO();
	static public PersonDAO get() {
		return singletonInstance;
	}
}
