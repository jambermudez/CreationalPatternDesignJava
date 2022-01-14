package main;

import prototype.PrototypeCard;
import prototype.PrototypeFactory;
import prototype.PrototypeFactory.CardType;

public class Main {

	public static void main(String[] args) {
		System.out.print("---------------------------------------------------------");
		System.err.print(" Prototype ");
		System.out.print("---------------------------------------------------------");
		System.out.println();
		testPrototype();

	}
	
	private static void testPrototype() {
		PrototypeFactory.loadCard();
		
		try {
			PrototypeCard visa = PrototypeFactory.getInstance(CardType.VISA);
			visa.getCard();
			
			PrototypeCard amex = PrototypeFactory.getInstance(CardType.AMEX);
			amex.getCard();
			
		} catch (CloneNotSupportedException cloneException) {
			cloneException.printStackTrace();
		}
	}

}
