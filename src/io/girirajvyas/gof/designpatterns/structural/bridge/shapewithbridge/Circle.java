package io.girirajvyas.gof.designpatterns.structural.bridge.shapewithbridge;

public class Circle extends Shape {

	public Circle(Colour colour) {
		super(colour);
	}

	@Override
	public void applyColour() {
		colour.applyColour();
	}

}
