package io.girirajvyas.gof.designpatterns.behavioral.templatemethod;

public abstract class OrderTemplate {

	public boolean isGift; // hook

	public abstract void doCheckout(); // Operation
	public abstract void doPayment(); // Operation
	public abstract void doReceipt(); // Operation
	public abstract void doDelivery(); // Operation
	
	public final void wrapGift() {
		System.out.println("Gift wrapped");
	}
	
	// final so as to restrict overriding
	public final void processOrder() {
		
		doCheckout();
		doPayment();
		if(isGift) {
			wrapGift();
		} else {
			doReceipt();
		}
		doDelivery();
	}
}
