package io.girirajvyas.gof.designpatterns.behavioral.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		BikeRepository repo = new BikeRepository();

		repo.addBike("Pulsar");
		repo.addBike("Avenger");
		repo.addBike("Dominar");

		/*
		 * Iterator<String> bikeIterator = repo.iterator();
		 * 
		 * while(bikeIterator.hasNext()) { System.out.println(bikeIterator.next()); }
		 */

		for (String bike : repo) {
			System.out.println(bike);
		}

	}
}
