package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.after;

public class Oil implements AtvPart {

	@Override
	public double calculateShipping() {
		return 5;
	}
}
