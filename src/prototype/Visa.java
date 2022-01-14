package prototype;

public class Visa implements PrototypeCard{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void getCard() {
		System.out.println("Card VISA");
	}

	@Override
	public PrototypeCard clone() throws CloneNotSupportedException {
		System.out.println("Clone Card VISA...");
		return (Visa) super.clone();
	}



}
