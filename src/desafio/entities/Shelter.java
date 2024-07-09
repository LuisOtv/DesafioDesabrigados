package desafio.entities;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.products.Clothes;
import desafio.products.ClothesEnum;
import desafio.products.Food;
import desafio.products.Hygiene;

public class Shelter {

	String name;
	String address;
	String manager;
	String phone;
	String email;
	Integer capacity;
	Integer occupied;

	ArrayList<Clothes> clothes = new ArrayList<>();
	ArrayList<Hygiene> hygiene = new ArrayList<>();
	ArrayList<Food> food = new ArrayList<>();

	public Shelter() {
	}

	public Shelter(String name, String address, String manager, String phone, String email, Integer capacity,
			Integer occupied) {
		super();
		this.name = name;
		this.address = address;
		this.manager = manager;
		this.phone = phone;
		this.email = email;
		this.capacity = capacity;
		this.occupied = occupied;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getOccupied() {
		return occupied;
	}

	public void setOccupied(Integer occupied) {
		this.occupied = occupied;
	}

	public ArrayList<Clothes> getClothes() {
		return clothes;
	}

	public void setClothes(ArrayList<Clothes> clothes) {
		this.clothes = clothes;
	}

	public ArrayList<Hygiene> getHygiene() {
		return hygiene;
	}

	public void setHygiene(ArrayList<Hygiene> hygiene) {
		this.hygiene = hygiene;
	}

	public ArrayList<Food> getFood() {
		return food;
	}

	public void setFood(ArrayList<Food> food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Nome: " + name + " (" + (occupied * 100 / capacity) + "%)";
	}
	
	public Order addOrder(Scanner sc) {
		
		int entry = -1;
		
		System.out.println("-x-x-x- Qual desses items pretende pedir? -x-x-x- \n 1 - Roupas\n 2 - Comida\n 3 - Higiene\n 4 - Finalizar Pedido. \n");
		
		switch(entry) {
		
		case 1:
			
			System.out.println("-x-x-x- Qual a descricao da roupa? -x-x-x-");
			String clothesDesciption = sc.nextLine();
			
			System.out.println("-x-x-x- Qual o genero da roupa? -x-x-x-");
			ClothesEnum clothesGender;
			
			System.out.println("-x-x-x- Qual o tamanho da roupa? -x-x-x-");
			ClothesEnum clothesSize;
			
			Clothes c = new Clothes(clothesDesciption, , );
			
			break;

		case 2:
			
			
			
			break;
			
		case 3:
			
			
			
			break;
		
		case 4:
			
			Order o = new Order();
			
			break;
		}
		
		return null;
		
	}

}