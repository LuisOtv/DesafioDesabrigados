package desafio.products;

public class Food {

	String description;
	FoodEnum measure;
	String expiration;
	int quantity;
	
	public Food() {}

	public Food(String description, FoodEnum foodMeasure, String expiration, int quantity) {
		super();
		this.description = description;
		this.measure = foodMeasure;
		this.expiration = expiration;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FoodEnum getMeasure() {
		return measure;
	}

	public void setMeasure(FoodEnum measure) {
		this.measure = measure;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "descricao: " + description + ", medida: " + measure + ", validade: " + expiration
				+ ", qunatidade: " + quantity;
	}
	
}
