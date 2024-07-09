package desafio.entities;

import java.util.ArrayList;

import desafio.products.Clothes;
import desafio.products.Food;
import desafio.products.Hygiene;

public class Center {

	// Informacoes gerais
	String name;
	String address;
	Integer number;
	String state;
	Integer cep;

	ArrayList<Clothes> clothes = new ArrayList<>();
	ArrayList<Hygiene> hygiene = new ArrayList<>();
	ArrayList<Food> food = new ArrayList<>();

	public Center() {
	}

	public Center(String name, String address, Integer number, String state, Integer cep) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.state = state;
		this.cep = cep;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
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
	
	
	
}
