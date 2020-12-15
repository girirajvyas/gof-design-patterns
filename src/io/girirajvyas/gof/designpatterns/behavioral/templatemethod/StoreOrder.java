package io.girirajvyas.gof.designpatterns.behavioral.templatemethod;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Manually collect items in cart");
	}

	@Override
	public void doPayment() {
		System.out.println("Process payment with card present");
	}

	@Override
	public void doReceipt() {
		System.out.println("Print receipt");
	}

	@Override
	public void doDelivery() {
		System.out.println("Bag items at counter");
	}
}
