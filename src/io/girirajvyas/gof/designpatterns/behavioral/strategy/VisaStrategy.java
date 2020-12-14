package io.girirajvyas.gof.designpatterns.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = true;
		
		isValid = creditCard.getNumber().startsWith("4");
		
		if(isValid) {
			isValid = creditCard.getNumber().length() == 16;
		}
		
		if(isValid) {
			isValid = isPassingLuhnAlgo(creditCard.getNumber());
		}
		
		return isValid;
	}

}
