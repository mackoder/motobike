package motobike.dao;

import java.util.ArrayList;
import java.util.List;
import motobike.model.Entity;

public class GenericDAO<T extends Entity> {
	private final List<T> entities = new ArrayList<>();

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
	
	public int size() {
		return entities.size();
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
