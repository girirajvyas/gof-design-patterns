package io.girirajvyas.gof.designpatterns.structural.bridge.shapewithoutbridge;

public class ShapeWithoutBrideDemo {

	public static void main(String[] args) {
		Circle circle = new GreenCircle();
		Square square = new RedSquare();
		
		circle.applyColor();
		square.applyColor();
	}
}
