package abstractfactory;

public class CardFactory implements AbstracFactory<Card> {

	@Override
	public Card create(String type) {
		if (Constants.VISA.equals(type)) {
			return new Visa();
		}else {
			if (Constants.MASTERCARD.equals(type)) {
				return new MasterCard();
			}
		}
		
		return null;
	}

}
