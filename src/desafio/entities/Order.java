package desafio.entities;

import desafio.products.Clothes;
import desafio.products.Food;
import desafio.products.Hygiene;

public class Order {
	
	
	Clothes clothes;
	Food food;
	Hygiene hygiene;
	Shelter shelter;
	
	public Order(Clothes clothes,  Food food, Hygiene hygiene, Shelter shelter) {
		super();
		this.clothes = clothes;
		this.food = food;
		this.hygiene = hygiene;
		this.shelter = shelter;
	
	}
	
	

	public Clothes getClothes() {
		return clothes;
	}



	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}



	public Food getFood() {
		return food;
	}



	public void setFood(Food food) {
		this.food = food;
	}



	public Hygiene getHygiene() {
		return hygiene;
	}



	public void setHygiene(Hygiene hygiene) {
		this.hygiene = hygiene;
	}



	public Shelter getShelter() {
		return shelter;
	}



	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}



	@Override
	public String toString() {
		return "Pedido = \nRoupas: " + clothes + "\nComida: " + food + "\nHigiene: " + hygiene;
	}
	
}