package io.girirajvyas.gof.designpatterns.creational.abstractfactory;

public abstract class CreditCard {
	protected int cardNumberLength;
	protected int csc;

	public int getCardNumberLength() {
		return cardNumberLength;
	}

	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	public int getCsc() {
		return csc;
	}

	public void setCsc(int csc) {
		this.csc = csc;
	}

}
