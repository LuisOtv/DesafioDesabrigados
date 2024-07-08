package desafio.products;

import java.util.ArrayList;

import desafio.entities.Abrigo;

public class Pedido {
	
	Integer soap = 0;
	Integer brush = 0;
	Integer toothpaste = 0;
	Integer tampon = 0;
	Abrigo shelter;
	
	ArrayList<Alimento> food = new ArrayList<>();
	ArrayList<Roupa> shirt = new ArrayList<>();
	ArrayList<Roupa> hoodie = new ArrayList<>();
	
	public Pedido() {}
	
	public Pedido(Integer soap, Integer brush, Integer toothpaste, Integer tampon, Abrigo shelter,
			ArrayList<Alimento> food, ArrayList<Roupa> shirt, ArrayList<Roupa> hoodie) {
		super();
		this.soap = soap;
		this.brush = brush;
		this.toothpaste = toothpaste;
		this.tampon = tampon;
		this.shelter = shelter;
		this.food = food;
		this.shirt = shirt;
		this.hoodie = hoodie;
	}

	public Integer getSoap() {
		return soap;
	}

	public void setSoap(Integer soap) {
		this.soap = soap;
	}

	public Integer getBrush() {
		return brush;
	}

	public void setBrush(Integer brush) {
		this.brush = brush;
	}

	public Integer getToothpaste() {
		return toothpaste;
	}

	public void setToothpaste(Integer toothpaste) {
		this.toothpaste = toothpaste;
	}

	public Integer getTampon() {
		return tampon;
	}

	public void setTampon(Integer tampon) {
		this.tampon = tampon;
	}

	public Abrigo getShelter() {
		return shelter;
	}

	public void setShelter(Abrigo shelter) {
		this.shelter = shelter;
	}

	public ArrayList<Alimento> getFood() {
		return food;
	}

	public void setFood(ArrayList<Alimento> food) {
		this.food = food;
	}

	public ArrayList<Roupa> getShirt() {
		return shirt;
	}

	public void setShirt(ArrayList<Roupa> shirt) {
		this.shirt = shirt;
	}

	public ArrayList<Roupa> getHoodie() {
		return hoodie;
	}

	public void setHoodie(ArrayList<Roupa> hoodie) {
		this.hoodie = hoodie;
	}

	@Override
	public String toString() {
		return "Pedido = Sabao:" + soap + ", Escova: " + brush + ", Pasta: " + toothpaste + ", Absorvente: " + tampon
				+ ", Abrigo: " + shelter + ", Comida: " + food + ", Camisa: " + shirt + ", Agasalho: " + hoodie;
	}
	
	
	
}