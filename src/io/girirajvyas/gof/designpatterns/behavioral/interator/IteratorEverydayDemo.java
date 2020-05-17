package io.girirajvyas.gof.designpatterns.behavioral.interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Amar");
		names.add("Akbar");
		names.add("Anthony");
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			itr.remove();
		}
		System.out.println("Names size: "+ names.size());
	}
}
