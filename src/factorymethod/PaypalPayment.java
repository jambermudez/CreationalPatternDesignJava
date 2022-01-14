package factorymethod;

public class PaypalPayment implements Payment {

	@Override
	public void doPayment() {
		System.out.println("Paypal payment...... ");
	}

}
