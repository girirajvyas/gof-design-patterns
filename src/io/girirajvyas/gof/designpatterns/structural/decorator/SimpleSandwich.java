package io.girirajvyas.gof.designpatterns.structural.decorator;

public class SimpleSandwich implements Sandwich {

	@Override
	public String make() {
		return "Simple Sandwich (only Bread)";
	}

}
