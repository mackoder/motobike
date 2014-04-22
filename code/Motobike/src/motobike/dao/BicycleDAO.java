package motobike.dao;

import java.util.ArrayList;
import java.util.List;
import motobike.model.Bicycle;

public class BicycleDAO {
	private List<Bicycle> entities = new ArrayList<Bicycle>();
	
	public void create(final Bicycle entity) {
		entities.add(entity);
	}
	
	public void read() {
		
	}
	
	public void update() {
	
	}
	
	public void delete(final Bicycle entity) {
		entities.remove(entity);
	}
	
	public List<Bicycle> findByMake(final String make) {
		List<Bicycle> result = new ArrayList<Bicycle>();
		return result;
	}

	public List<Bicycle> findByModel(final String model) {
		List<Bicycle> result = new ArrayList<Bicycle>();
		return result;
	}

	public List<Bicycle> findByPrice(final double floor, final double ceiling) {
		List<Bicycle> result = new ArrayList<Bicycle>();
		return result;
	}
}
