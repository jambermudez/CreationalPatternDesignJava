package main;

import singleton.Card;

public class Main {

	public static void main(String[] args) {
		System.out.print("---------------------------------------------------------");
		System.err.print(" Singleton ");
		System.out.print("---------------------------------------------------------");
		System.out.println();
		testSingleton();

	}
	
	private static void testSingleton() {
		Card.getINSTANCE().setCardNumber("000000 000000 000001");
		System.out.println("Card Number:" + Card.getINSTANCE().getCardNumber());
	}

}
