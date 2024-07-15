package desafio.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import desafio.products.Clothes;
import desafio.products.Food;
import desafio.products.Hygiene;

@Entity
@Table(name = "tb_orders")
public class OrderRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(cascade = CascadeType.ALL)
    private Clothes clothes;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Food food;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Hygiene hygiene;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Shelter shelter;
	
	public OrderRequest(){}
	
	public OrderRequest(Integer id, Clothes clothes,  Food food, Hygiene hygiene, Shelter shelter) {
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
		return "Pedido: \nRoupas: " + clothes + "\nComida: " + food + "\nHigiene: " + hygiene;
	}
	
		
	}
	
