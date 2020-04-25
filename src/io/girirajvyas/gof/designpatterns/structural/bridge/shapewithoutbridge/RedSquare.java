package io.girirajvyas.gof.designpatterns.structural.bridge.shapewithoutbridge;

public class RedSquare extends Square {

	@Override
	public void applyColor() {
		System.out.println("Applying red colour");
	}

}
