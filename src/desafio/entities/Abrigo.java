package desafio.entities;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.products.Alimento;
import desafio.products.Pedido;
import desafio.products.Roupa;

public class Abrigo {

	String name;
	String address;
	String manager;
	String phone;
	String email;
	Integer capacity;
	Integer occupied;

	Integer soap = 0;
	Integer brush = 0;
	Integer toothpaste = 0;
	Integer tampon = 0;

	ArrayList<Alimento> food = new ArrayList<>();
	ArrayList<Roupa> shirt = new ArrayList<>();
	ArrayList<Roupa> hoodie = new ArrayList<>();

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
		return "Nome: " + name + " ("+ (occupied * 100 / capacity)+ "%)";
	}

	public Pedido addOrder() {

		Scanner sc = new Scanner(System.in);

		addProduct("Sabao", soap, 200, sc);
		addProduct("Escova", brush, 200, sc);
		addProduct("Pasta", toothpaste, 200, sc);
		addProduct("Absorvente", tampon, 200, sc);

		String foodQuantity;
		String foodMeasure;
		String foodExpiration;
		String foodDescription;
		
		System.out.println("----x-x-x----\nQuanto alimento?\n----x-x-x----");
		
		foodQuantity = sc.nextLine();
		
		System.out.println("----x-x-x----\nQual medida?\n----x-x-x----");
		
		foodMeasure = sc.nextLine();
		
		System.out.println("----x-x-x----\nQual validade? (dd/MM/yyyy)\n----x-x-x----");
		
		foodExpiration = sc.nextLine();
		
		System.out.println("----x-x-x----\nQual a descricao?\n----x-x-x----");
		
		foodDescription = sc.nextLine();
		
		Alimento a = new Alimento(foodQuantity, foodMeasure, foodExpiration,foodDescription);
		
		food.add(a);

		addClothes("Camiseta", shirt, sc);
		addClothes("Agasalho", hoodie, sc);
		

		Pedido p = new Pedido(soap, brush, toothpaste, tampon, this, food, shirt, hoodie);
		
		return p;
	}
	
	private void addProduct(String productName, Integer productList, int limit,Scanner sc) {
	    
	    System.out.println("----x-x-x----\nQuanto " + productName + "?\n----x-x-x----");
	    int amount = sc.nextInt();
	    
	    if (amount + productList > limit) {
	        System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + productList + "/" + limit + ")");
	    } else {
	        productList += amount;
	        System.out.println("Produto adicionado: " + productName + " (" + amount + ")");
	    }
	    sc.nextLine();
	}
	
	private void addClothes(String productName, ArrayList<Roupa> List, Scanner sc) {
		
		String g = null;
		String s = null;
		int quantity = 0;
		int entry = -1;
		
		System.out.println("---------x-x-x---------\n" + "Qual o genero da " + productName + "?\n " + "1 - M \n " + "2 - F \n "
				+ "0 - Cancelar \n" + "---------x-x-x---------");

		entry = sc.nextInt();

		if (entry == 1) {

			g = "M";

		} else if (entry == 2) {

			g = "F";

		}

		System.out.println("---------x-x-x---------\n" + "Qual o tamanho da " + productName + "?\n " + "1 - Infantil \n "
				+ "2 - PP \n " + "3 - P \n " + "4 - M \n " + "5 - G \n " + "6 - GG \n " + "0 - Cancelar\n"
				+ "---------x-x-x---------");

		entry = sc.nextInt();

		if (entry == 1) {

			s = "Infantil";

		} else if (entry == 2) {

			s = "PP";

		} else if (entry == 3) {

			s = "P";

		} else if (entry == 4) {

			s = "M";

		} else if (entry == 5) {

			s = "G";

		} else if (entry == 6) {

			s = "GG";

		}

		System.out.println("---------x-x-x---------\n" + "Quantas " + productName + "?\n " + "---------x-x-x---------");
		
		quantity = sc.nextInt();
		
		Roupa r = new Roupa(g, s, quantity);

		List.add(r);
		
	}
	
}
