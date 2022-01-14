package abstractfactory;

public class Debit implements PaymentMethod{

	@Override
	public String doPayment() {
		return "Debit Pay...";
	}

}
