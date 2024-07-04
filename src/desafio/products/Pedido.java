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
	ArrayList<Camisa> shirt = new ArrayList<>();
	ArrayList<Agasalho> hoodie = new ArrayList<>();
	
	public Pedido(Integer soap, Integer brush, Integer toothpaste, Integer tampon, Abrigo shelter,
			ArrayList<Alimento> food, ArrayList<Camisa> shirt, ArrayList<Agasalho> hoodie) {
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

	@Override
	public String toString() {
		return "PEDIDO DO ABRIGO :"+ shelter +"\n ITENS: Sabão" + soap + ", Escova: " + brush + ", Pasta: " + toothpaste + ", Absorvente: " + tampon
				+ ", Comida: " + food + ", Camisa: " + shirt + ", Agasalho: " + hoodie;
	}
	
	
	
}
