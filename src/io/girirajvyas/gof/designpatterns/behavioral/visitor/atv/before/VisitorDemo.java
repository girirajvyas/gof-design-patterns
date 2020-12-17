package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.before;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		
		order.addParts(new Wheel());
		order.addParts(new Oil());
		order.addParts(new Fender());
		
		order.accept(new AtvPartsShippingVisitor());
		System.out.println();
		order.accept(new AtvPartsDisplayVisitor());
	}
}
