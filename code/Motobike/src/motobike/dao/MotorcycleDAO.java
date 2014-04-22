package motobike.dao;

import java.util.ArrayList;
import java.util.List;
import motobike.model.Motorcycle;

public class MotorcycleDAO {
	private List<Motorcycle> entities = new ArrayList<Motorcycle>();
	
	public void add(final Motorcycle entity) {
		entities.add(entity);
	}
	
	public void update(final Motorcycle entity) {
		int item = entities.indexOf(entity);
		if (item != -1) {
			entities.set(item, entity);
		}
	}
	
	public void delete(final Motorcycle entity) {
		entities.remove(entity);
	}
	
	public List<Motorcycle> findByMake(final String make) {
		List<Motorcycle> result = new ArrayList<Motorcycle>();
		return result;
	}

	public List<Motorcycle> findByModel(final String model) {
		List<Motorcycle> result = new ArrayList<Motorcycle>();
		return result;
	}

	public List<Motorcycle> findByPrice(final double floor, final double ceiling) {
		List<Motorcycle> result = new ArrayList<Motorcycle>();
		return result;
	}
}
