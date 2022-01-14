package abstractfactory;

public class FactoryProvider {

	public static AbstracFactory<?> getFactory(String chooseFactory) {
		if (Constants.CARD.equals(chooseFactory)) {
			return new CardFactory();
		}else {
			if (Constants.PAYMENTMETHOD.equals(chooseFactory)) {
				return new PaymentMethodFactory();
			}
		}
		
		return null;
	}
	
}
