package motobike.dao;

import java.util.ArrayList;
import java.util.List;
import motobike.model.Motorcycle;

public class MotorcycleDAO {
	private List<Motorcycle> entities = new ArrayList<Motorcycle>();
	
	public void create(final Motorcycle entity) {
		entities.add(entity);
	}
	
	public void read() {
		
	}
	
	public void update() {
	
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
