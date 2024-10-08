package desafio.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import desafio.entities.Center;
import desafio.entities.OrderRequest;
import desafio.entities.Shelter;
import desafio.products.Clothes;
import desafio.products.Food;
import desafio.products.Hygiene;
import desafio.products.enums.ClothesEnum;
import desafio.products.enums.FoodEnum;
import desafio.products.enums.HygieneEnum;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Shelter> toAddShelters = new ArrayList<>(); // LISTA ABRIGOS NA LISTA DE VALIDACAO
		ArrayList<Shelter> trustedShelters = new ArrayList<>(); // LISTA ABRIGOS VALIDADOS
		ArrayList<OrderRequest> orders = new ArrayList<>(); // LISTA DE PEDIDOS
		ArrayList<Center> centers = new ArrayList<>();// LISTA CENTROS DE DISTRIUICAO

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("desafiodesabrigados");
		EntityManager em = emf.createEntityManager();

		Center CD1 = new Center(null, "Centro de Distribuição Esperança", "Av. Boqueirão", 2450, "RS", 92032 - 420); // CENTRO
		// DE
		// DISTRIBUICAO
		Center CD2 = new Center(null, "Centro de Distribuição Prosperidade", "Av. Borges de Medeiros", 1501, "RS",
				90119 - 900); // CENTRO DE DISTRIBUICAO
		Center CD3 = new Center(null, "Centro de Distribuição Reconstrução", "R. Dr. Décio Martins Costa", 312, "RS",
				94920 - 170); // CENTRO DE DISTRIBUICAO

		Shelter a1 = new Shelter(null, "Felicidade", "Rua Nova Casa", "Joao", "(16) 91293-1092",
				"felicidadeabrigo@gmail.com", 100, 80);
		Shelter a2 = new Shelter(null, "Esperantina", "Rua Brasil Raiz", "Maria", "(16) 91234-1897",
				"esperantinaabrigo@gmail.com", 150, 100);
		Shelter a3 = new Shelter(null, "Novissimo", "Rua Governador", "Pedro", "(18) 96789-6970",
				"novissimoabrigo@gmail.com", 200, 120);

		toAddShelters.add(a1);
		toAddShelters.add(a2);
		trustedShelters.add(a3);

		centers.add(CD1);
		centers.add(CD2);
		centers.add(CD3);
		
		
		em.getTransaction().begin();
		em.persist(CD1);
		em.persist(CD2);
		em.persist(CD3);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.getTransaction().commit();

		// INTERFACE
		int entry = -1;
		while (entry != 0) {

			System.out.println("-x-x-x- Oque você é ? -x-x-x- \n " + "1 - Gerente \n " + "2 - Abrigo \n "
					+ "3 - Centro de Dis. \n " + "4 - Ler CSV \n " + "0 - Sair");

			entry = sc.nextInt();
			sc.nextLine();

			// SISTEMA DE MENUS
			switch (entry) {

			// ABA DO GERENTE
			case 1:

				handleManager(sc, toAddShelters, trustedShelters, em);

				break;

			// ABA ABRIGOS
			case 2:

				handleShelter(sc, toAddShelters, trustedShelters, orders, em);

				break;

			// ABA CENTRO DE DISTRIBUICAO
			case 3:

				handleCenter(sc, centers, orders, em);

				break;

			case 4:

				String csvFile = "src/main/java/orders.csv";
				String[] data;

				try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
					reader.readNext(); 

					while ((data = reader.readNext()) != null) {
						String clothesDescription = data[1];
						ClothesEnum clothesSize = ClothesEnum.valueOf(data[2]);
						ClothesEnum clothesGender = ClothesEnum.valueOf(data[3]);
						String foodDescription = data[4];
						FoodEnum foodMeasure = FoodEnum.valueOf(data[5]);
						String foodExpiration = data[6];
						int foodQuantity = Integer.parseInt(data[7]);
						String hygieneDescription = data[8];
						HygieneEnum hygieneItem = HygieneEnum.valueOf(data[9]);

						
						Clothes clothes = new Clothes(null, clothesDescription, clothesSize, clothesGender);
						Food food = new Food(null, foodDescription, foodMeasure, foodExpiration, foodQuantity);
						Hygiene hygiene = new Hygiene(null, hygieneDescription, hygieneItem);
						Shelter shelter = trustedShelters.get(0); 

						OrderRequest orderRequest = new OrderRequest(null, clothes, food, hygiene, shelter);
						orders.add(orderRequest);
						
						em.getTransaction().begin();
						em.persist(orderRequest);
						em.getTransaction().commit();
						
						System.out.println("Created OrderRequest: " + orderRequest);
					}
				} catch (IOException | CsvValidationException e) {
					e.printStackTrace();
				}
				break;

			}

		}
		sc.close();

	}

	// LOGICA DA ABA GERENTE
	public static void handleManager(Scanner sc, ArrayList<Shelter> _toAddShelters, ArrayList<Shelter> _trustedShelters,
			EntityManager em) {

		int entry = -1;

		Integer list = 1;
		Integer selectedShelter = null;

		while (entry != 0) {

			System.out.println("-x-x-x- Olá, o que pretendes fazer ? -x-x-x- \n " + "1 - Cadastrar abrigo \n "
					+ "2 - Verificar Abrigo \n " + "3 - Recusar abrigo  \n " + "4 - Lista de abrigos \n "
					+ "5 - Remover Abrigo \n " + "0 - Sair");

			entry = sc.nextInt();
			sc.nextLine();
			switch (entry) {

			case 1:// ADICIONAR ABRIGO A LISTA DE ESPERA

				System.out.println("-x-x-x- Digite o nome do abrigo. -x-x-x-");
				String shelterName = sc.nextLine();

				System.out.println("-x-x-x- Digite o endereco do abrigo. -x-x-x-");
				String shelterAddress = sc.nextLine();

				System.out.println("-x-x-x- Digite o gerente do abrigo. -x-x-x-");
				String shelterManager = sc.nextLine();

				System.out.println("-x-x-x- Digite o telefone do abrigo. -x-x-x-");
				String shelterPhone = sc.nextLine();

				System.out.println("-x-x-x- Digite o email do abrigo. -x-x-x-");
				String shelterEmail = sc.nextLine();

				System.out.println("-x-x-x- Digite a capacidade do abrigo. -x-x-x-");
				Integer shelterCapacity = sc.nextInt();

				System.out.println("-x-x-x- Digite a ocupacao do abrigo. -x-x-x-");
				Integer shelterOccupation = sc.nextInt();

				Shelter s = new Shelter(null, shelterName, shelterAddress, shelterManager, shelterPhone, shelterEmail,
						shelterCapacity, shelterOccupation);

				_toAddShelters.add(s);

				em.getTransaction().begin();
				em.persist(s);
				em.getTransaction().commit();

				System.out.println("-x-x-x- Obrigado, os dados enviados para um de nossos colaboradores. -x-x-x-");

				break;

			case 2: // VERIFICAR ABRIGO

				list = 1;

				System.out.println("-x-x-x- Qual desses abrigos pretende autorizar? -x-x-x-");

				for (Shelter x : _toAddShelters) {

					System.out.println(list + " - " + x);
					list += 1;

				}

				selectedShelter = sc.nextInt() - 1;

				_trustedShelters.add(_toAddShelters.get(selectedShelter));
				_toAddShelters.remove(_toAddShelters.get(selectedShelter));

				break;

			case 3: // RECUSAR ABRIGO

				list = 1;

				System.out.println("-x-x-x- Qual desses abrigos pretende recusar? -x-x-x-");

				for (Shelter x : _toAddShelters) {

					System.out.println(list + " - " + x);
					list += 1;

				}

				selectedShelter = sc.nextInt() - 1;

				_toAddShelters.remove(_toAddShelters.get(selectedShelter));

				break;

			case 4: // VER LISTA DE ABRIGOS

				list = 1;

				System.out.println("-x-x-x- Abrigos autorizados -x-x-x-");

				for (Shelter x : _trustedShelters) {

					System.out.println(list + " - " + x);
					list += 1;

				}

				list = 1;

				System.out.println("-x-x-x- Abrigos a serem verificados -x-x-x-");

				for (Shelter x : _toAddShelters) {

					System.out.println(list + " - " + x);
					list += 1;

				}

				break;

			case 5: // REMOVER ABRIGO

				list = 1;

				System.out.println("-x-x-x- Qual desses abrigos pretende remover? -x-x-x-");

				for (Shelter x : _trustedShelters) {

					System.out.println(list + " - " + x);
					list += 1;

				}

				selectedShelter = sc.nextInt() - 1;

				_trustedShelters.remove(_trustedShelters.get(selectedShelter));

				break;

			}
		}

	}

	// LOGICA DA ABA ABRIGO
	public static void handleShelter(Scanner sc, ArrayList<Shelter> _toAddShelters, ArrayList<Shelter> _trustedShelters,
			ArrayList<OrderRequest> _orders, EntityManager em) {

		int entry = -1;

		Integer list = 1;
		Shelter selectedShelter = null;

		while (entry != 0) {

			System.out.println("-x-x-x- Qual abrigo ? -x-x-x- \n");
			list = 1;

			for (Shelter x : _trustedShelters) {

				System.out.println(list + " - " + x);
				list += 1;

			}

			selectedShelter = _trustedShelters.get(sc.nextInt() - 1);

			System.out.println("-x-x-x- Olá, o que pretendes fazer ? -x-x-x- \n " + "1 - Solicitar doaçao \n "
					+ "2 - Atualizar populacao \n " + "3 - Ver inventario \n " + "0 - Sair");

			entry = sc.nextInt();
			sc.nextLine();

			switch (entry) {

			// SOLICITAR DOACAO
			case 1:

				selectedShelter.addOrder(sc, _orders, em);
				System.out.println(_orders);
				entry = -1;

				break;

			// ATUALIZAR POPULACAO
			case 2:

				System.out.println("-x-x-x- Digite a nova ocupacao -x-x-x-" + "(" + selectedShelter.getOccupied() + "/"
						+ selectedShelter.getCapacity() + ")");
				selectedShelter.setOccupied(sc.nextInt());
				sc.nextLine();
				System.out.println(selectedShelter);

				break;

			// VER INVENTARIO
			case 3:

				System.out.println("Roupas: \n");
				for (Clothes x : selectedShelter.getClothes()) {
					System.out.println(x + "\n");
				}
				System.out.println("Comidas: \n");
				for (Food x : selectedShelter.getFood()) {
					System.out.println(x + "\n");
				}
				System.out.println("Higiene: \n");
				for (Hygiene x : selectedShelter.getHygiene()) {
					System.out.println(x + "\n");
				}

				break;

			}

		}

	}

	public static void handleCenter(Scanner sc, ArrayList<Center> _centers, ArrayList<OrderRequest> _orders,
			EntityManager em) {

		int entry = -1;
		int list = 1;

		while (entry != 0) {

			System.out.println("-x-x-x- Qual o centro ? -x-x-x-");
			list = 1;

			for (Center x : _centers) {

				System.out.println(list + " - " + x);
				list += 1;

			}

			Center selectedCenter = _centers.get(sc.nextInt() - 1);

			System.out.println("-x-x-x- Olá, o que pretendes fazer ? -x-x-x- \n " + "1 - Receber Doacao \n "
					+ "2 - Ver pedidos \n " + "3 - Autorizar pedido  \n " + "4 - Recusar pedido \n "
					+ "5 - Ver inventario \n " + "0 - Sair");

			entry = sc.nextInt();
			switch (entry) {

			case 1:

				selectedCenter.addDonation(sc, selectedCenter.getClothes(), selectedCenter.getFood(),
						selectedCenter.getHygiene());

				break;

			case 2:

				for (OrderRequest x : _orders) {
					System.out.println(x + "\n");
				}

				break;

			case 3:

				System.out.println("-x-x-x- Qual o pedido ? -x-x-x- \n");
				list = 1;
				for (OrderRequest x : _orders) {

					System.out.println(list + " - " + x);
					list += 1;

				}

				OrderRequest selectedOrder = _orders.get(sc.nextInt() - 1);

				Iterator<Clothes> iterator = selectedCenter.getClothes().iterator();
				while (iterator.hasNext()) {
					Clothes x = iterator.next();
					if (x.equals(selectedOrder.getClothes())) {
						System.out.println("Roupa enviada");
						selectedOrder.getShelter().getClothes().add(x);
						iterator.remove();
					}
				}

				Iterator<Food> foodIterator = selectedCenter.getFood().iterator();
				while (foodIterator.hasNext()) {
					Food x = foodIterator.next();
					if (x.equals(selectedOrder.getFood())) {
						System.out.println("Comida enviada");
						selectedOrder.getShelter().getFood().add(x);
						foodIterator.remove();
						selectedOrder.setFood(null);
					}
				}

				Iterator<Hygiene> hygieneIterator = selectedCenter.getHygiene().iterator();
				while (hygieneIterator.hasNext()) {
					Hygiene x = hygieneIterator.next();
					if (x.equals(selectedOrder.getHygiene())) {
						System.out.println("Produto de Higiene enviada");
						selectedOrder.getShelter().getHygiene().add(x);
						hygieneIterator.remove();
						selectedOrder.setHygiene(null);
					}
				}

				if (selectedOrder.getClothes() == null && selectedOrder.getFood() == null
						&& selectedOrder.getHygiene() == null) {

					selectedOrder = null;
				}

				break;

			case 4:

				System.out.println("-x-x-x- Qual o pedido ? -x-x-x- \n");
				list = 1;
				for (OrderRequest x : _orders) {

					System.out.println(list + " - " + x);
					list += 1;

				}

				OrderRequest selectedOrder1 = _orders.get(sc.nextInt() - 1);

				em.getTransaction().begin();
				em.remove(selectedOrder1);
				em.getTransaction().commit();

				System.out.println("-x-x-x- Removido -x-x-x-");

				break;

			case 5:

				System.out.println("Roupas: \n");
				for (Clothes x : selectedCenter.getClothes()) {
					System.out.println(x + "\n");
				}
				System.out.println("Comidas: \n");
				for (Food x : selectedCenter.getFood()) {
					System.out.println(x + "\n");
				}
				System.out.println("Higiene: \n");
				for (Hygiene x : selectedCenter.getHygiene()) {
					System.out.println(x + "\n");
				}

				break;
			}
		}

	}

}