package desafio.entities;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.products.Agasalho;
import desafio.products.Alimento;
import desafio.products.Camisa;
import desafio.products.Pedido;

public class Abrigo {

	String name;
	String address;
	String manager;
	String phone;
	String email;
	Integer capacity;
	Integer occupied;

	// Itens
	Integer soap = 0;
	Integer brush = 0;
	Integer toothpaste = 0;
	Integer tampon = 0;
	
	ArrayList<Alimento> food = new ArrayList<>();
	ArrayList<Camisa> shirt = new ArrayList<>();
	ArrayList<Agasalho> hoodie = new ArrayList<>();

	public Abrigo() {
	}

	public Abrigo(String name, String address, String manager, String phone, String email, Integer capacity,
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

	@Override
	public String toString() {
		return "Nome: " + name;
	}
	
	public Pedido addOrder() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("----x-x-x----\nQuanto Sabao?\n----x-x-x----");
		
		Integer ammount = sc.nextInt();
		
		if(ammount + soap > 200) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + soap + "/200)");
			
		}else {
			
			soap += ammount;
			
		}

		System.out.println("----x-x-x----\nQuanta escova?\n----x-x-x----");
		
		ammount = sc.nextInt();
		
		if(ammount + brush > 200) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + brush + "/200)");
			
		}else {
			
			brush += ammount;
			
		}
		
		System.out.println("----x-x-x----\nQuanta pasta?\n----x-x-x----");
		
		ammount = sc.nextInt();
		
		if(ammount + toothpaste > 200) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + toothpaste + "/200)");
			
		}else {
			
			toothpaste += ammount;
			
		}

		System.out.println("----x-x-x----\nQuanto absorvente?\n----x-x-x----");
		
		ammount = sc.nextInt();
		
		if(ammount + tampon > 200) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + tampon + "/200)");
			
		}else {
			
			tampon += ammount;
			
		}
		
		String foodQuantity;
		String foodMeasure;
		String foodExpiration;
		
		System.out.println("----x-x-x----\nQuanto alimento?\n----x-x-x----");
		
		sc.nextLine();
		foodQuantity = sc.nextLine();
		
		System.out.println("----x-x-x----\nQual medida?\n----x-x-x----");
		
		foodMeasure = sc.nextLine();
		
		System.out.println("----x-x-x----\nQual validade (dd/MM/yyyy)?\n----x-x-x----");
		
		foodExpiration = sc.nextLine();
		
		Alimento a = new Alimento(foodQuantity, foodMeasure, foodExpiration);
		
		food.add(a);
		
		Pedido p = new Pedido(soap, brush, toothpaste, tampon, this, food, shirt, hoodie);
		
		return p;
		
	}
	
	
	
}
