package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.before;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

	@Override
	public void visit(Fender fender) {
		System.out.println("We have fender");
	}

	@Override
	public void visit(Oil oil) {
		System.out.println("We have oil");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("We have wheel");
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("We have an order");
	}

}
