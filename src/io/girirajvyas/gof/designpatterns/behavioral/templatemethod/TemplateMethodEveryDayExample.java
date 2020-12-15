package io.girirajvyas.gof.designpatterns.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateMethodEveryDayExample {

	public static void main(String[] args) {

		Person p1 = new Person("Giri", 20);
		Person p2 = new Person("Raj", 24);
		Person p3 = new Person("Vyas", 19);
		
		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		System.out.println("Before: "+ people.toString());
		
		Collections.sort(people);
		System.out.println("Sort by age: " + people.toString());
	}
}
