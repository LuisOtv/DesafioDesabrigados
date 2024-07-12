package desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import desafio.products.Clothes;
import desafio.products.Food;
import desafio.products.Hygiene;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;
	@ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;
	@ManyToOne
    @JoinColumn(name = "hygiene_id")
    private Hygiene hygiene;
	@OneToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;
	
	public Order(Integer id, Clothes clothes,  Food food, Hygiene hygiene, Shelter shelter) {
		super();
		this.id = id;
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
	
