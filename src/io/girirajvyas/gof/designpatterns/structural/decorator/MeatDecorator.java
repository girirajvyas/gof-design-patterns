package io.girirajvyas.gof.designpatterns.structural.decorator;

public class MeatDecorator extends SandwichDecorator{

	// Mandatory as no default constructor exposed in parent
	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}
	
	public String make() {
		return customSandwich.make() + addMeat();
	}
	
	private String addMeat() {
		return " + turkey";
	}

}
