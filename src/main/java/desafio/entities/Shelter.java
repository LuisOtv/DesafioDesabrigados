package desafio.entities;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import desafio.products.Clothes;
import desafio.products.Food;
import desafio.products.Hygiene;
import desafio.products.enums.ClothesEnum;
import desafio.products.enums.FoodEnum;
import desafio.products.enums.HygieneEnum;

@Entity
@Table(name = "tb_shelters")
public class Shelter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String address;
	private String manager;
	private String phone;
	private String email;
	private Integer capacity;
	private Integer occupied;

	private ArrayList<Clothes> clothes = new ArrayList<>();
	private ArrayList<Hygiene> hygiene = new ArrayList<>();
	private ArrayList<Food> food = new ArrayList<>();

	public Shelter() {
	}

	public Shelter(Integer id, String name, String address, String manager, String phone, String email, Integer capacity,
			Integer occupied) {
		super();
		this.id = id;
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

	public void addOrder(Scanner sc, ArrayList<OrderRequest> orders, EntityManager em) {

		Clothes c = new Clothes();
		Food f = new Food();
		Hygiene h = new Hygiene();

		int entry = -1;

		while (entry != 4) {
			
			System.out.println(
					"-x-x-x- Qual desses items pretende pedir? -x-x-x- \n 1 - Roupas\n 2 - Comida\n 3 - Higiene\n 4 - Finalizar Pedido\n 0 - Cancelar");
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

				System.out.println("-x-x-x- Qual o tamanho da roupa? -x-x-x- \n 1 - PP \n 2 - P \n 3 - M \n 4 - G \n 5 - GG");
				
				int size = sc.nextInt(); sc.nextLine();

				if (size == 1) {

					clothesSize = ClothesEnum.P;

				} else if (size == 2) {

					clothesSize = ClothesEnum.PP;

				} else if (size == 3) {

					clothesSize = ClothesEnum.M;

				} else if (size == 4) {

					clothesSize = ClothesEnum.G;

				} else if (size == 5) {

					clothesSize = ClothesEnum.GG;

				}

				c = new Clothes(null, clothesDesciption, clothesSize, clothesGender);

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

				f = new Food(null, foodDescription, foodMeasure, foodExpire, foodQuantity);

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

				h = new Hygiene(null, hygieneDescription, hygieneItem);

				break;

			case 4:

				OrderRequest o = new OrderRequest(null, c, f, h, this);
				
				em.getTransaction().begin();
				em.persist(o);
				em.getTransaction().commit();
				
				orders.add(o);

			}
			
		}
	}

}