package desafio.products;

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
		return "Hygiene [description=" + description + ", item=" + item + "]";
	}

	

}
