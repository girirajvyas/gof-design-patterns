package io.girirajvyas.gof.designpatterns.behavioral.templatemethod;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Get items from cart");
		System.out.println("set gift preferences");
		System.out.println("set Delivery address");
		System.out.println("set billing address");
	}

	@Override
	public void doPayment() {
		System.out.println("Process payment without card present");
	}

	@Override
	public void doReceipt() {
		System.out.println("Ship the item to address");
	}

	@Override
	public void doDelivery() {
		System.out.println("Email receipt");
	}
}
