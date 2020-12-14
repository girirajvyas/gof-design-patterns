package io.girirajvyas.gof.designpatterns.behavioral.strategy;

public abstract class ValidationStrategy {

	public abstract boolean isValid(CreditCard creditCard);

	/**
	 * https://en.wikipedia.org/wiki/Luhn_algorithm
	 * @param creditCardNumber
	 * @return
	 */
	protected boolean isPassingLuhnAlgo(String creditCardNumber) {
		int sum = 0;
		boolean alternate = false;

		for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
			int n = Integer.parseInt(creditCardNumber.substring(i, i + 1));

			if (alternate) {
				n = n * 2;
				if (n > 9) {
					n = (n % 10) + 1;
				}
			}
			sum = sum + n;
			alternate = !alternate;
		}

		return (sum % 10 == 0);
	}
}
