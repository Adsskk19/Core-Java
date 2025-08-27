package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapOperation {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Social", 90);
		map.put("Maths", 99);
		map.put("English", 95);
		map.put("english", 93);
		map.put("Hindi", null);
		map.put(null, null);
		map.put(null, 2);
		System.out.println(map.get("Social"));
		System.out.println(map.get(90));
		// null means no key
		System.out.println(map.get(null));

		System.out.println(map.containsKey(null));
		// means null is a key there in map
		System.out.println(map.containsKey("Social"));
		map.remove("Social");
		System.out.println(map.containsKey("Social"));

		System.out.println(map.keySet());
		// you can get all keys as a Set

		System.out.println(map.values());

		System.out.println("-------------------");

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			// System.out.println(entry);
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		System.out.println("-------------------");

		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		// System.out.println(map);

		Driver d1 = new Driver(1, "XXXX", 120.45);
		Driver d2 = new Driver(2, "YYYY", 230.75);
		Driver d3 = new Driver(3, "ZZZZ", 87.9);
		Driver d4 = new Driver(1, "XXXX", 120.45);

//		HashMap<Integer, Driver> drivers = new HashMap<Integer, Driver>();
//
//		drivers.put(d1.id, d1);
//		drivers.put(d2.id, d1);
//		drivers.put(d3.id, d1);
//		drivers.put(d4.id, d1);
//
//		System.out.println(drivers);
//		System.out.println(drivers.get(1));
		
		HashMap<Driver,Integer> drivers = new HashMap<Driver,Integer>(); 

		drivers.put(d1,d1.id);
		drivers.put(d2,d2.id);
		drivers.put(d3,d3.id);
		drivers.put(d4,d4.id);
		System.out.println("-------------------");
		//System.out.println(drivers);
		
		for(Map.Entry<Driver, Integer> driver : drivers.entrySet()) {
			System.out.println(driver);
		}
		
		
	}

}

class Driver {
	int id;
	String name;
	double distanceTravelled;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	public Driver(int id, String name, double distanceTravelled) {
		super();
		this.id = id;
		this.name = name;
		this.distanceTravelled = distanceTravelled;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", distanceTravelled=" + distanceTravelled + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(distanceTravelled, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return Double.doubleToLongBits(distanceTravelled) == Double.doubleToLongBits(other.distanceTravelled)
				&& id == other.id && Objects.equals(name, other.name);
	}

	
}
