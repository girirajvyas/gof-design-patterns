package io.girirajvyas.gof.designpatterns.structural.bridge.shapewithbridge;

public class ShapeWIthBridgeDemo {

	public static void main(String[] args) {
		Colour redColour = new RedColour();
		Colour blueColour = new BlueColour();

		Shape square = new Square(redColour);
		Shape circle = new Circle(blueColour);

		square.applyColour();
		circle.applyColour();

		// In case we have to add a new shape or colour it is independent and can be
		// easily added
	}
}
