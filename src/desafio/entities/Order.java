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

	@Override
	public String toString() {
		return "Pedido = \nRoupas: " + clothes + "\nComida: " + food + "\nHigiene: " + hygiene;
	}
	
}