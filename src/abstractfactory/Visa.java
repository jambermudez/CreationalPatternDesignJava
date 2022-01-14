package abstractfactory;

public class Visa implements Card{

	@Override
	public String getCardType() {
		return Constants.VISA;
	}

	@Override
	public String getCardNumber() {
		return "0000 0000 0000 VISA";
	}

}
