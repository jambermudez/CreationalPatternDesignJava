package main;

public class Main {

	public static void main(String[] args) {
		System.out.print("---------------------------------------------------------");
		System.err.print(" Builder ");
		System.out.print("---------------------------------------------------------");
		System.out.println();
		testBuilder();

	}
	
	private static void testBuilder() {
		builder.Card card = new builder.Card.CardBuilder("VISA", "0000 0000 0000 VISA").build();
		
		System.out.println(card.toString());
		
		builder.Card card1 = new builder.Card.CardBuilder("VISA", "0000 0000 0000 VISA")
				.credit(false)
				.expires(2024)
				.name("Jose")
				.build();
		
		System.out.println(card1.toString());	
	}
	

}
