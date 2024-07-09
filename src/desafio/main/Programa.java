package desafio.main;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.entities.Center;
import desafio.entities.Order;
import desafio.entities.Shelter;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Shelter> toAddShelters = new ArrayList<>(); // LISTA ABRIGOS NA LISTA DE VALIDACAO
		ArrayList<Shelter> trustedShelters = new ArrayList<>(); // LISTA ABRIGOS VALIDADOS
		ArrayList<Order> orders = new ArrayList<>(); // LISTA DE PEDIDOS
		ArrayList<Center> centers = new ArrayList<>();// LISTA CENTROS DE DISTRIUICAO

		Center CD1 = new Center("Centro de Distribuição Esperança", "Av. Boqueirão", 2450, "RS", 92032 - 420); // CENTRO
																												// DE
																												// DISTRIBUICAO
		Center CD2 = new Center("Centro de Distribuição Prosperidade", "Av. Borges de Medeiros", 1501, "RS",
				90119 - 900); // CENTRO DE DISTRIBUICAO
		Center CD3 = new Center("Centro de Distribuição Reconstrução", "R. Dr. Décio Martins Costa", 312, "RS",
				94920 - 170); // CENTRO DE DISTRIBUICAO

		Shelter a1 = new Shelter("Felicidade", "Rua Nova Casa", "Joao", "(16) 91293-1092", "felicidadeabrigo@gmail.com",
				100, 80);
		Shelter a2 = new Shelter("Esperantina", "Rua Brasil Raiz", "Maria", "(16) 91234-1897",
				"esperantinaabrigo@gmail.com", 150, 100);
		Shelter a3 = new Shelter("Novissimo", "Rua Governador", "Pedro", "(18) 96789-6970", "novissimoabrigo@gmail.com",
				200, 120);

		toAddShelters.add(a1);
		toAddShelters.add(a2);
		trustedShelters.add(a3);

		centers.add(CD1);
		centers.add(CD2);
		centers.add(CD3);

		// INTERFACE
		int entry = -1;
		while (entry != 0) {

			System.out.println("-x-x-x- Oque você é ? -x-x-x- \n " + "1 - Gerente \n " + "2 - Abrigo \n "
					+ "3 - Centro de Dis. \n " + "0 - Sair");

			entry = sc.nextInt();
			sc.nextLine();

			// SISTEMA DE MENUS
			switch (entry) {

			// ABA DO GERENTE
			case 1:

				handleManager(sc, toAddShelters, trustedShelters);

				break;

			// ABA CENTRO DE DISTRIBUICAO
			case 2:

				handleShelter(sc, toAddShelters, trustedShelters);

				break;

			// ABA ABRIGOS
			case 3:

				handleCenter(sc, toAddShelters, trustedShelters);

				break;
			}
		}
		sc.close();
	}

	public static void handleManager(Scanner sc, ArrayList<Shelter> _toAddShelters,
			ArrayList<Shelter> _trustedShelters) {

		int entry = -1;

		Integer list = 1;
		Integer selectedShelter = null;

		while (entry != 0) {

			System.out.println("-x-x-x- Olá, o que pretendes fazer ? -x-x-x- \n " + "1 - Cadastrar abrigo \n "
					+ "2 - Verificar Abrigo \n " + "3 - Recusar abrigo  \n " + "4 - Lista de abrigos \n "
					+ "5 - Remover Abrigo \n " + "0 - Sair");

			entry = sc.nextInt();
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

				Shelter s = new Shelter(shelterName, shelterAddress, shelterManager, shelterPhone, shelterEmail,
						shelterCapacity, shelterOccupation);

				_toAddShelters.add(s);

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

	public static void handleShelter(Scanner sc, ArrayList<Shelter> _toAddShelters, ArrayList<Shelter> _trustedShelters) {

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
					+ "2 - Atualizar populacao \n " + "0 - Sair");

			switch (entry) {
			
			case 1:
				
				selectedShelter.addOrder(sc);

				break;

			}

		}

	}

	public static void handleCenter(Scanner sc, ArrayList<Shelter> _toAddShelters,
			ArrayList<Shelter> _trustedShelters) {

	}

}