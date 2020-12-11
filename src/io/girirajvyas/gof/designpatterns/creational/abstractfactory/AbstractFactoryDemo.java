package io.girirajvyas.gof.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {

	private static final int CREDIT_SCORE_LOW = 649;
	private static final int CREDIT_SCORE_HIGH = 651;

	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(CREDIT_SCORE_HIGH);
		CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(creditCard.getClass());

		abstractFactory = CreditCardFactory.getCreditCardFactory(CREDIT_SCORE_LOW);
		creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(creditCard.getClass());
	}
}
