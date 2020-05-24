package io.girirajvyas.gof.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

	private String[] bikes;
	private int index;

	public BikeRepository() {
		bikes = new String[10];
		index = 0;
	}

	public void addBike(String bike) {
		// create new array if it is full
		if (index == bikes.length) {
			String[] largerBikes = new String[bikes.length];
			System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
			bikes = largerBikes;
			largerBikes = null;
		}
		bikes[index] = bike;
		index++;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> iter = new Iterator<String>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}

			@Override
			public String next() {
				return bikes[currentIndex++];
			}
		};
		return iter;
	}
}
