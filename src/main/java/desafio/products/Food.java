package desafio.products;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	private String description;
	private FoodEnum measure;
	private String expiration;
	private int quantity;
	
	public Food() {}

	public Food(Integer id, String description, FoodEnum foodMeasure, String expiration, int quantity) {
		super();
		this.id = id;
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

	@Override
	public int hashCode() {
		return Objects.hash(description, expiration, measure, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(description, other.description) && Objects.equals(expiration, other.expiration)
				&& measure == other.measure && quantity == other.quantity;
	}
	
	
	
}
