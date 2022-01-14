package abstractfactory;

public class Credit implements PaymentMethod{

	@Override
	public String doPayment() {
		return "Credit Pay....";
	}

}
