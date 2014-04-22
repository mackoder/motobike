package motobike.dao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import motobike.model.Bicycle;
import motobike.model.Vehicle;

public class VehicleDAO<T extends Vehicle> {
	private List<T> entities = new ArrayList<T>();

	public void add(final T entity) {
		entities.add(entity);
	}
	
	public T read(final int id) {
		// XXX: Ridículamente caro! O(N)
		for (T x : entities) {
			if (x.getID() == id) {
				return x;
			}
		}
		
		throw new IndexOutOfBoundsException();
	}
	
	public void update(final T entity) {
		int item = entities.indexOf(entity);
		if (item != -1) {
			entities.set(item, entity);
		}
	}

	public void delete(final T entity) {
		entities.remove(entity);
	}

	public List<T> findByMake(final String make) {
		List<T> result = new ArrayList<T>();
		
		return result;
	}

	public List<T> findByModel(final String model) {
		List<T> result = new ArrayList<T>();
		return result;
	}

	public List<T> findByPrice(final double floor, final double ceiling) {
		List<T> result = new ArrayList<T>();
		return result;
	}
}
