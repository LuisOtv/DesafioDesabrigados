package desafio.main;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.entities.Abrigo;
import desafio.entities.CentroDistribuicao;

public class Programa {

	public static void main(String[] args) {

		// Lista de abrigos autorizados e lista de espera
		ArrayList<Abrigo> toAddShelters = new ArrayList<>();
		ArrayList<Abrigo> trustedShelters = new ArrayList<>();

		// Variaveis para a interface textual
		int entry = -1;
		int cont = -1;
		int managertab = -1;
		int centertab = -1;

		Scanner sc = new Scanner(System.in);

		// Gerando centros de distribuição
		CentroDistribuicao CD1 = new CentroDistribuicao("Centro de Distribuição Esperança", "Av. Boqueirão", 2450, "RS",
				92032 - 420);
		CentroDistribuicao CD2 = new CentroDistribuicao("Centro de Distribuição Prosperidade", "Av. Borges de Medeiros",
				1501, "RS", 90119 - 900);
		CentroDistribuicao CD3 = new CentroDistribuicao("Centro de Distribuição Reconstrução",
				"R. Dr. Décio Martins Costa", 312, "RS", 94920 - 170);

		ArrayList<CentroDistribuicao> centers = new ArrayList<>();
		centers.add(CD1);
		centers.add(CD2);
		centers.add(CD3);

		// Interface textual
		while (entry != 0) {

			System.out.println("---------x-x-x---------");
			System.out.println("Oque voce eh ?\n 1 - Gerente \n 2 - Centro de Dis. \n 3 - Abrigo  \n 0 - Sair ");
			System.out.println("---------x-x-x---------");

			entry = sc.nextInt();
			sc.nextLine();

			// Sistema de menus
			switch (entry) {

			// AREA DO GERENTE
			case 1:
				cont = -1;
				System.out.println("---------x-x-x---------");
				System.out.println(
						"Oque pretendes fazer ?\n 1 - Adicionar abrigo \n 2 - Autorizar abrigo \n 3 - Recusar abrigo \n 3 - Ver abrigos \n 0 - Sair ");
				System.out.println("---------x-x-x---------");

				managertab = sc.nextInt();

				switch (managertab) {

				case 1:
					while (cont != 0) {
						String shelterName = null;
						String shelterAddress = null;
						String shelterManager = null;
						String shelterPhone = null;
						String shelterEmail = null;
						Integer shelterCapacity = null;
						Integer shelterOccupied = null;

						System.out.println("---------x-x-x---------");
						System.out.println("Digite o nome do abrigo");
						System.out.println("---------x-x-x---------");

						sc.nextLine();
						shelterName = sc.nextLine();

						System.out.println("------------x-x-x------------");
						System.out.println("Digite o endereço do abrigo");
						System.out.println("------------x-x-x------------");

						shelterAddress = sc.nextLine();

						System.out.println("--------------x-x-x--------------");
						System.out.println("Digite o responsavel do abrigo");
						System.out.println("--------------x-x-x--------------");

						shelterManager = sc.nextLine();

						System.out.println("------------x-x-x------------");
						System.out.println("Digite o telefone do abrigo");
						System.out.println("------------x-x-x------------");

						shelterPhone = sc.nextLine();

						System.out.println("----------x-x-x----------");
						System.out.println("Digite o email do abrigo");
						System.out.println("----------x-x-x----------");

						shelterEmail = sc.nextLine();

						System.out.println("-------------x-x-x-------------");
						System.out.println("Digite a capacidade do abrigo");
						System.out.println("-------------x-x-x-------------");

						shelterCapacity = sc.nextInt();

						System.out.println("-----------x-x-x-----------");
						System.out.println("Digite a ocupaçao do abrigo");
						System.out.println("-----------x-x-x-----------");

						shelterOccupied = sc.nextInt();

						Abrigo a = new Abrigo(shelterName, shelterAddress, shelterManager, shelterPhone, shelterEmail,
								shelterCapacity, shelterOccupied);
						toAddShelters.add(a);

						System.out.println("------------------------x-x-x------------------------");
						System.out.println("As informacoes enviadas serao verificadas, Obrigado.");
						System.out.println("------------------------x-x-x------------------------");

						// Repetir
						System.out.println("---------x-x-x---------");
						System.out.println("Desejas adicionar mais?\n 1 - Sim \n 0 - Nao");
						System.out.println("---------x-x-x---------");

						cont = sc.nextInt();

					}
					break;
				// Autorizar abrigos
				case 2:

					while (cont != 0) {
						cont = -1;
						Integer list = 0;
						System.out.println("------------------x-x-x------------------");
						System.out.println("Qual desses abrigos pretendes autorizar?");
						System.out.println("------------------x-x-x------------------");

						for (Abrigo s : toAddShelters) {
							list += 1;
							System.out.println(list + " - " + s);
						}

						Integer selectedShelter = sc.nextInt();

						// move o abrigo para a lista de abrigos autorizados e remove da lista de espera
						trustedShelters.add(toAddShelters.get(selectedShelter - 1));
						toAddShelters.remove(selectedShelter - 1);

						// Repetir
						System.out.println("---------x-x-x---------");
						System.out.println("Desejas autorizar mais?\n 1 - Sim \n 0 - Nao");
						System.out.println("---------x-x-x---------");

						cont = sc.nextInt();
					}

					break;
				case 3:
					while (cont != 0) {

						Integer list = 0;
						System.out.println("------------------x-x-x------------------");
						System.out.println("Qual desses abrigos pretendes recusar?");
						System.out.println("------------------x-x-x------------------");

						for (Abrigo s : toAddShelters) {
							list += 1;
							System.out.println(list + " - " + s);
						}

						Integer selectedShelter = sc.nextInt();

						// Exclui o abrigo da lista de espera
						toAddShelters.remove(selectedShelter - 1);

						// Repetir
						System.out.println("---------x-x-x---------");
						System.out.println("Desejas recusar mais?\n 1 - Sim \n 0 - Nao");
						System.out.println("---------x-x-x---------");

						cont = sc.nextInt();
					}

					// Checar a lista de abrigos autorizados e a serem autorizados
				case 4:

					Integer list2 = 0;

					System.out.println("-----------x-x-x------------");
					System.out.println("Abrigos a serem autorizados");
					System.out.println("-----------x-x-x------------");

					for (Abrigo s : toAddShelters) {
						list2 += 1;
						System.out.println(list2 + " - " + s);
					}

					list2 = 0;
					System.out.println("--------x-x-x--------");
					System.out.println("Abrigos a autorizados");
					System.out.println("--------x-x-x--------");

					for (Abrigo s : trustedShelters) {
						list2 += 1;
						System.out.println(list2 + " - " + s);
					}
					break;

				}
				break;
			//ABA CENTRO DE DISTRIBUICAO
			case 2:

				Integer list = 0;

				System.out.println("------------x-x-x------------");
				System.out.println("Qual centro de distribuicao ?");
				System.out.println("------------x-x-x------------");

				for (CentroDistribuicao s : centers) {
					list += 1;
					System.out.println(list + " - " + s);
				}

				Integer selectedCenter = sc.nextInt();

				cont = -1;
				System.out.println("---------x-x-x---------");
				System.out.println(
						"Oque pretendes fazer ?\n 1 - Receber lote \n 2 - Autorizar pedido \n 3 - Recusar pedido \n 3 - Ver pedidos \n 0 - Sair ");
				System.out.println("---------x-x-x---------");

				managertab = sc.nextInt();

				switch (centertab) {
				case 1:

					System.out.println("------x-x-x------");
					System.out.println("Quantos saboes ?");
					System.out.println("------x-x-x------");

					centers.get(selectedCenter - 1).addSoap(sc.nextInt());

					System.out.println("------x-x-x------");
					System.out.println("Quantas escovas ?");
					System.out.println("------x-x-x------");

					centers.get(selectedCenter - 1).addBrush(sc.nextInt());

					System.out.println("------x-x-x------");
					System.out.println("Quantas pastas ?");
					System.out.println("------x-x-x------");

					centers.get(selectedCenter - 1).addToothpaste(sc.nextInt());

					System.out.println("------x-x-x------");
					System.out.println("Quantos absorventes ?");
					System.out.println("------x-x-x------");

					centers.get(selectedCenter - 1).addTampon(sc.nextInt());

					System.out.println("------x-x-x------");
					System.out.println("Quanto arroz ?");
					System.out.println("------x-x-x------");

					centers.get(selectedCenter - 1).addRice(sc.nextInt());

					System.out.println("------x-x-x------");
					System.out.println("Quanto feijao ?");
					System.out.println("------x-x-x------");

					centers.get(selectedCenter - 1).addBean(sc.nextInt());

					System.out.println("------x-x-x------");
					System.out.println("Quanto leite ?");
					System.out.println("------x-x-x------");

					centers.get(selectedCenter - 1).addMilk(sc.nextInt());

					break;
				case 2:

				}
			//ABA ABRIGO
			case 3:

			}
		}
		sc.close();
	}
}
