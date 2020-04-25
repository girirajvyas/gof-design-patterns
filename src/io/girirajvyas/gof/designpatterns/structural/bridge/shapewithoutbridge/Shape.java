package io.girirajvyas.gof.designpatterns.structural.bridge.shapewithoutbridge;

public abstract class Shape {

	public Shape() {
		// here you do nothing, in case you are using bridge you take dependency ion
		// constructor and set class variable
	}

	public abstract void applyColor();

}
