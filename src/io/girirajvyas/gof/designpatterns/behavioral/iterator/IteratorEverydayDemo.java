package io.girirajvyas.gof.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		//Set<String> names = new HashSet<>();
		
		names.add("Amar");
		names.add("Akbar");
		names.add("Anthony");

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			itr.remove();
		}
		System.out.println("Names size: " + names.size());

		// foreach: iterate over an array or iterable
		for (String name : names) {
			System.out.println(name);
		}

		// if we change its type from list to set it wont work
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
}
