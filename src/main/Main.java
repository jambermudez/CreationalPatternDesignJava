package main;

import abstractfactory.AbstracFactory;
import abstractfactory.Card;
import abstractfactory.Constants;
import abstractfactory.FactoryProvider;
import abstractfactory.PaymentMethod;

public class Main {

	public static void main(String[] args) {

		System.out.print("---------------------------------------------------------");
		System.err.print(" AbstractFactory ");
		System.out.print("---------------------------------------------------------");
		System.out.println();
		testAbstractFactory();

	}
	
	private static void testAbstractFactory() {
		AbstracFactory<?> abstractFactory1 = FactoryProvider.getFactory(Constants.CARD);
		Card cardVisa = (Card) abstractFactory1.create(Constants.VISA);
		
		System.out.println("Type card " + cardVisa.getCardType() + " with number " + cardVisa.getCardNumber());
		
		AbstracFactory<?> abstractFactory2 = FactoryProvider.getFactory(Constants.PAYMENTMETHOD);
		PaymentMethod paymentMethod = (PaymentMethod) abstractFactory2.create(Constants.DEBIT);
		
		System.out.println("Type card " + cardVisa.getCardType() + " and method payment " + paymentMethod.doPayment());
	}

}
