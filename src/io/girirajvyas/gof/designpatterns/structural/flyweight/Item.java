package io.girirajvyas.gof.designpatterns.structural.flyweight;

// Instances of this class will be Flyweights, You can also see it is immutable
public class Item {

	private final String name;

	public Item(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}

	
}
