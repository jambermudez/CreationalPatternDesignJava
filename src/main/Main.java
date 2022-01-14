package main;

import factorymethod.Payment;
import factorymethod.PaymentFactory;
import factorymethod.TypePayment;

public class Main {

	public static void main(String[] args) {
		System.out.print("---------------------------------------");
		System.err.print(" FactoryMethod ");
		System.out.print("---------------------------------------");
		System.out.println();
		testFactoryMethod();
		System.out.println();
	}
	
	private static void testFactoryMethod() {
		Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
		payment.doPayment();
		
		payment = PaymentFactory.buildPayment(TypePayment.PAYPALPAY);
		payment.doPayment();
	}

}
