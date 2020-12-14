package io.girirajvyas.gof.designpatterns.behavioral.strategy;

public class CreditCard {
	
	private String number;
	private String expiry;
	private String cvv;
	private ValidationStrategy strategy;
	
	public CreditCard(ValidationStrategy strategy) {
		this.strategy = strategy;
	}
	
	public boolean isValid() {
		return strategy.isValid(this);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
}
