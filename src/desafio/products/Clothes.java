package desafio.products;

import java.util.Objects;

public class Clothes{
	
	String description;
	ClothesEnum size;
	ClothesEnum gender;
	
	public Clothes() {}

	public Clothes(String description, ClothesEnum size, ClothesEnum gender) {
		super();
		this.description = description;
		this.size = size;
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ClothesEnum getSize() {
		return size;
	}

	public void setSize(ClothesEnum size) {
		this.size = size;
	}

	public ClothesEnum getGender() {
		return gender;
	}

	public void setGender(ClothesEnum gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "descriçao: " + description + ", tamanho: " + size + ", genero: " + gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, gender, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clothes other = (Clothes) obj;
		return Objects.equals(description, other.description) && gender == other.gender && size == other.size;
	}

	
	
}
