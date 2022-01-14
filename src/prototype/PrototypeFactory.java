package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static class CardType{
		public static final String VISA = "visa";
		public static final String AMEX = "amex";
	}
	
	private static Map<String, PrototypeCard> prototypes = new HashMap<String, PrototypeCard>();
	
	public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException {
		return prototypes.get(type).clone();
	}
	
	public static void loadCard() {
		Visa visa = new Visa();
		visa.setName("Card Visa 000000000000");
		prototypes.put(CardType.VISA, visa);
		
		Amex amex = new Amex();
		amex.setName("Card AMEX 000000000002");
		prototypes.put(CardType.AMEX, amex);
	}
}
