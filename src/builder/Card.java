package builder;

public class Card {

	private final String cardTye;
	private final String number;
	private final String name;
	private final int exprires;
	private final boolean credit;
	
	private Card(CardBuilder builder) {
		this.cardTye = builder.cardTye;
		this.number = builder.number;
		this.name = builder.name;
		this.exprires = builder.exprires;
		this.credit = builder.credit;
	}
	
	public String getCardTye() {
		return cardTye;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getExprires() {
		return exprires;
	}

	public boolean isCredit() {
		return credit;
	}
	
	@Override
	public String toString() {
		return "Card: " + cardTye + " " + number + " " + name + " " + exprires + " " + credit;
	}


	public static class CardBuilder {
		private String cardTye;
		private String number;
		private String name;
		private int exprires;
		private boolean credit;
		
		public CardBuilder(String cardTye, String number){
			this.cardTye = cardTye;
			this.number = number;
		}
		
		public CardBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public CardBuilder expires (int exprires) {
			this.exprires = exprires;
			return this;
		}
		
		public CardBuilder credit(boolean credit) {
			this.credit = credit;
			return this;
		}
		
		public Card build() {
			return new Card(this);
		}
	}
	
}
