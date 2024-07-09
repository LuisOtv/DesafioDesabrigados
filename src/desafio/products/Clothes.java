package desafio.products;

public class Clothes{
	
	String description;
	ClothesEnum sizeGender;

	public Clothes() {}

	public Clothes(String description, ClothesEnum size, ClothesEnum gender) {
		super();
		this.description = description;
		this.sizeGender = size;
		this.sizeGender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ClothesEnum getSizeGender() {
		return sizeGender;
	}

	public void setSizeGender(ClothesEnum sizeGender) {
		this.sizeGender = sizeGender;
	}

	@Override
	public String toString() {
		return "Clothes [description=" + description + ", sizeGender=" + sizeGender + "]";
	}

	
	
}
