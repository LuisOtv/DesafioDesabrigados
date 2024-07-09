package desafio.products;

import java.util.Date;

public class Food {

	String description;
	String measure;
	Date expiration;
	int quantity;
	
	public Food() {}

	public Food(String description, String measure, Date expiration, int quantity) {
		super();
		this.description = description;
		this.measure = measure;
		this.expiration = expiration;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
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
		return "Food [description=" + description + ", measure=" + measure + ", expiration=" + expiration
				+ ", quantity=" + quantity + "]";
	}
	
}
