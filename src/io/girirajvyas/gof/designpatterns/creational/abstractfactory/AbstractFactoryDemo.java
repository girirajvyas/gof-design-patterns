package io.girirajvyas.gof.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(651);
		CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(creditCard.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(649);
		creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(creditCard.getClass());
	}
}
