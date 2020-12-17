package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.after;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		
		order.addParts(new Wheel());
		order.addParts(new Oil());
		order.addParts(new Fender());
		
		double shippingCost = order.calculateShipping();
		System.out.println(shippingCost);
	}
}
