package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.before;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

	double shippingAmount = 0;
	
	@Override
	public void visit(Fender fender) {
		System.out.println("Adding cost of Fender");
		shippingAmount += 1;
	}

	@Override
	public void visit(Oil oil) {
		System.out.println("Adding cost of oil");
		shippingAmount += 5;
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Adding cost of wheel");
		shippingAmount += 10;
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		if(partsOrder.getParts().size() > 2) {
			System.out.println("As more than 2 items bought, discount applied");
			System.out.println("Original amount: " + shippingAmount);
			shippingAmount -= 5;
		}
		System.out.println("Final Shipping Amount is: " + shippingAmount);
	}

}
