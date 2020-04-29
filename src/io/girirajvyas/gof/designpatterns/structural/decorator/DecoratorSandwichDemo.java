package io.girirajvyas.gof.designpatterns.structural.decorator;

public class DecoratorSandwichDemo {
	public static void main(String[] args) {
		// Concrete Component
		Sandwich simpleSandwich = new SimpleSandwich();
		// Concrete Decorator
		MeatDecorator meatDecorator = new MeatDecorator(simpleSandwich);
		// Concrete Decorator
		DressingDecorator dressingDecorator = new DressingDecorator(meatDecorator);
		
		System.out.println(dressingDecorator.make());
		
		// In short
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}
	

}
