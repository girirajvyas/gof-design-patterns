package io.girirajvyas.gof.designpatterns.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		// Valid scenario
		CreditCard amexCard = new CreditCard(new AmexStrategy());
		amexCard.setNumber("379185883464283");
		amexCard.setExpiry("12/2020");
		amexCard.setCvv("123");
		System.out.println("is Amex valid: " + amexCard.isValid());
		
		// Editing 1 number from credit card to make it invalid
		CreditCard amexCard2 = new CreditCard(new AmexStrategy());
		amexCard2.setNumber("379185883464284");
		amexCard2.setExpiry("12/2020");
		amexCard2.setCvv("123");
		System.out.println("is Amex valid: " + amexCard2.isValid());
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		visaCard.setNumber("4539589763663402");
		visaCard.setExpiry("12/2020");
		visaCard.setCvv("123");
		System.out.println("is Visa valid: " + visaCard.isValid());
	}

}
