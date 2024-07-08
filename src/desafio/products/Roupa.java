package desafio.products;

public class Roupa {

	String gender;
	String size;
	int quantity;

	public Roupa() {}

	public Roupa(String gender, String size, int quantity) {
		super();
		this.gender = gender;
		this.size = size;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
