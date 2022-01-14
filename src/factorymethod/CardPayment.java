package factorymethod;

public class CardPayment implements Payment {

	@Override
	public void doPayment() {
		System.out.println("Card payment......");
	}
}
