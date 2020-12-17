package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.after;

public class Wheel implements AtvPart {

	@Override
	public double calculateShipping() {
		return 10;
	}
}
