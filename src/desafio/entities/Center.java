package desafio.entities;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.products.Clothes;
import desafio.products.ClothesEnum;
import desafio.products.Food;
import desafio.products.FoodEnum;
import desafio.products.Hygiene;
import desafio.products.HygieneEnum;

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
	
	public void addDonation(Scanner sc, ArrayList<Clothes> _clothes, ArrayList<Food> _food, ArrayList<Hygiene> _hygiene) {

		Clothes c = new Clothes();
		Food f = new Food();
		Hygiene h = new Hygiene();

		int entry = -1;

		while (entry != 4) {
			
			System.out.println(
					"-x-x-x- Qual desses itens foram recebidos ? -x-x-x- \n 1 - Roupas\n 2 - Comida\n 3 - Higiene\n 4 - Finalizar \n 0 - Cancelar");
					entry = sc.nextInt(); sc.nextLine();
					
			switch (entry) {

			case 1:

				ClothesEnum clothesGender = null;
				ClothesEnum clothesSize = null;

				System.out.println("-x-x-x- Qual a descricao da roupa? -x-x-x-");
				String clothesDesciption = sc.nextLine().toLowerCase();

				System.out.println("-x-x-x- Qual o genero da roupa? -x-x-x- \n 1 - M \n 2 - F");
				
				entry = sc.nextInt(); sc.nextLine();
				
				if (entry == 1) {

					clothesGender = ClothesEnum.MASC;

				} else if (entry == 2) {

					clothesGender = ClothesEnum.FEM;

				}

				System.out.println("-x-x-x- Qual o tamanho da roupa? -x-x-x-");
				
				entry = sc.nextInt(); sc.nextLine();

				if (entry == 1) {

					clothesSize = ClothesEnum.P;

				} else if (entry == 2) {

					clothesSize = ClothesEnum.PP;

				} else if (entry == 3) {

					clothesSize = ClothesEnum.M;

				} else if (entry == 4) {

					clothesSize = ClothesEnum.G;

				} else if (entry == 5) {

					clothesSize = ClothesEnum.GG;

				}

				c = new Clothes(clothesDesciption, clothesGender, clothesSize);

				break;

			case 2:

				FoodEnum foodMeasure = null;

				System.out.println("-x-x-x- Qual a descricao da comida? -x-x-x-");
				String foodDescription = sc.nextLine().toLowerCase();

				System.out.println("-x-x-x- Qual a medida da comida? -x-x-x-\n 1 - KG\n 2 - L \n");
				
				entry = sc.nextInt(); sc.nextLine();

				if (entry == 1) {

					foodMeasure = FoodEnum.KG;

				} else if (entry == 2) {

					foodMeasure = FoodEnum.L;

				}

				System.out.println("-x-x-x- Qual a validade da comida? -x-x-x- (dd/MM/yyyy)");
				String foodExpire = sc.nextLine();

				System.out.println("-x-x-x- Qual a quantidade de comida? -x-x-x-");
				Integer foodQuantity = sc.nextInt();

				f = new Food(foodDescription, foodMeasure, foodExpire, foodQuantity);

				break;

			case 3:

				HygieneEnum hygieneItem = null;

				System.out.println("-x-x-x- Qual a descricao do produto de higiene? -x-x-x-");
				String hygieneDescription = sc.nextLine().toLowerCase();

				System.out.println(
						"-x-x-x- Qual o item? -x-x-x-\n 1 - Sabao\n 2 - Escova \n 3 - Pasta \n 4 - Absorvente");
				
				entry = sc.nextInt(); sc.nextLine();

				if (entry == 1) {

					hygieneItem = HygieneEnum.SOAP;

				} else if (entry == 2) {

					hygieneItem = HygieneEnum.BRUSH;

				} else if (entry == 3) {

					hygieneItem = HygieneEnum.PASTE;

				} else if (entry == 4) {

					hygieneItem = HygieneEnum.TAMPON;

				}

				h = new Hygiene(hygieneDescription, hygieneItem);

				break;

			case 4:

				_clothes.add(c);
				_food.add(f);
				_hygiene.add(h);

			}
			
		}
	}
	
	
}
