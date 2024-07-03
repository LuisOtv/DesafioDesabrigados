package desafio.entities;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.products.Agasalho;
import desafio.products.Alimento;
import desafio.products.Camisa;

public class CentroDistribuicao {

	// Informacoes gerais
	String name;
	String address;
	Integer number;
	String state;
	Integer cep;

	// Itens
	Integer soap = 0;
	Integer brush = 0;
	Integer toothpaste = 0;
	Integer tampon = 0;

	ArrayList<Alimento> food = new ArrayList<>();
	ArrayList<Camisa> shirt = new ArrayList<>();;
	ArrayList<Agasalho> hoodie = new ArrayList<>();

	public CentroDistribuicao() {}

	public CentroDistribuicao(String name, String address, Integer number, String state, Integer cep) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.state = state;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return name + "\n";
	}

	public void addItems() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("----x-x-x----\nQuanto Sabao?\n----x-x-x----");
		
		Integer ammount = sc.nextInt();
		
		if(ammount + soap > 1000) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + soap + "/1000)");
			
		}else {
			
			soap += ammount;
			
		}

		System.out.println("----x-x-x----\nQuanta escova?\n----x-x-x----");
		
		ammount = sc.nextInt();
		
		if(ammount + brush > 1000) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + brush + "/1000)");
			
		}else {
			
			brush += ammount;
			
		}
		
		System.out.println("----x-x-x----\nQuanta pasta?\n----x-x-x----");
		
		ammount = sc.nextInt();
		
		if(ammount + toothpaste > 1000) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + toothpaste + "/1000)");
			
		}else {
			
			toothpaste += ammount;
			
		}

		System.out.println("----x-x-x----\nQuanto absorvente?\n----x-x-x----");
		
		ammount = sc.nextInt();
		
		if(ammount + tampon > 1000) {
			
			System.out.println("Ultrapassa a quantidade limite, produto NAO adicionado. (" + tampon + "/1000)");
			
		}else {
			
			tampon += ammount;
			
		}
		
		String foodQuantity;
		String foodMeasure;
		String foodExpiration;
		
		System.out.println("----x-x-x----\nQuanto alimento?\n----x-x-x----");
		
		foodQuantity = sc.nextLine();
		
		System.out.println("----x-x-x----\nQual medida?\n----x-x-x----");
		
		foodMeasure = sc.nextLine();
		
		System.out.println("----x-x-x----\nQual validade (dd/MM/yyyy)?\n----x-x-x----");
		
		foodExpiration = sc.nextLine();
		
		Alimento a = new Alimento(foodQuantity, foodMeasure, foodExpiration);
		
		food.add(a);
		
		sc.close();
	}

}
