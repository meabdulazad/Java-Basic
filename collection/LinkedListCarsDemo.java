package com.java.collection;

import java.util.*;

public class LinkedListCarsDemo {

	public static void main(String[] args) {
		// creating list of cars
		List<LinkedListCars> list = new LinkedList<>();

		// creating cars by calling constructor methods
		LinkedListCars c1 = new LinkedListCars(2017, "Nissan", "Versa", "Blue");
		LinkedListCars c2 = new LinkedListCars(2019, "Honda", "Pilot", "White");
		LinkedListCars c3 = new LinkedListCars(2022, "Hyundai", "Palisade", "Red");
		LinkedListCars c4 = new LinkedListCars(2021, "Toyota", "Highlander", "Black");

		// adding the cars to the list
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);

		// traversing the list
		for (LinkedListCars c : list) {
			System.out.println(c.model_year + " " + c.car_name + " " + c.model_name + " " + c.car_color);
		}
	}
}