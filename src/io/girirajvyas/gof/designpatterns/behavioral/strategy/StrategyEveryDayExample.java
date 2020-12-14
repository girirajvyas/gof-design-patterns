package io.girirajvyas.gof.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEveryDayExample {

	public static void main(String[] args) {

		Person p1 = new Person("Giri", 20);
		Person p2 = new Person("Raj", 24);
		Person p3 = new Person("Vyas", 19);
		
		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		System.out.println("Before: "+ people.toString());
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}

				if (o1.getAge() < o2.getAge()) {
					return -1;
				}

				return 0;
			}
		});
		System.out.println("Sort by age: " + people.toString());
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("Sort by Name: " + people.toString());
	}
}
