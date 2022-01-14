package abstractfactory;

public class PaymentMethodFactory implements AbstracFactory<PaymentMethod> {

	@Override
	public PaymentMethod create(String type) {
		if (Constants.CREDIT.equals(type)) {
			return new Credit();
		}else {
			if (Constants.DEBIT.equals(type)){
				return new Debit();
			}
		}
		
		return null;
	}

}
