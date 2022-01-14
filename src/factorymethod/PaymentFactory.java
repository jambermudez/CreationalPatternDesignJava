package factorymethod;

public class PaymentFactory {

	public static Payment buildPayment(TypePayment typePayment) {
		
		switch (typePayment) {
			case PAYPALPAY:
				return new PaypalPayment();
	
			case CARD:
				return new CardPayment();
				
			default:
				return null;	
		}
	}
}
