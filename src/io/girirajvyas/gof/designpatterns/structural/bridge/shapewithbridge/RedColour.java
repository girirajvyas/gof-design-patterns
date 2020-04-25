package io.girirajvyas.gof.designpatterns.structural.bridge.shapewithbridge;

public class RedColour implements Colour {

	@Override
	public void applyColour() {
		System.out.println("Applying Red Colour");
	}

}
