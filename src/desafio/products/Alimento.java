package desafio.products;

public class Alimento {

	String quantity;
	String measure;
	String expiration;
	String description;
	
	public Alimento() {}
	
	public Alimento(String quantity, String measure, String expiration, String description) {
		super();
		this.quantity = quantity;
		this.measure = measure;
		this.expiration = expiration;
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
}