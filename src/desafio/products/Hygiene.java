package desafio.products;

import java.util.Objects;

public class Hygiene {

	String description;
	HygieneEnum item;
	
	public Hygiene() {}

	public Hygiene(String description, HygieneEnum item) {
		super();
		this.description = description;
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HygieneEnum getItem() {
		return item;
	}

	public void setItem(HygieneEnum item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "descricao: " + description + ", Item: " + item;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, item);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hygiene other = (Hygiene) obj;
		return Objects.equals(description, other.description) && item == other.item;
	}

	

}
