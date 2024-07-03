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
		int list = -1;
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

			System.out.println("---------x-x-x---------\n"
					+ "Oque voce eh ?\n "
					+ "1 - Gerente \n "
					+ "2 - Centro de Dis. \n "
					+ "3 - Abrigo  \n "
					+ "0 - Sair \n"
					+ "---------x-x-x---------");

			entry = sc.nextInt();
			sc.nextLine();

			// Sistema de menus
			switch (entry) {

			// AREA DO GERENTE
			case 1:
				cont = -1;
				System.out.println("---------x-x-x---------\n"
						+ "Oque pretendes fazer ?\n "
						+ "1 - Adicionar abrigo \n "
						+ "2 - Autorizar abrigo \n "
						+ "3 - Recusar abrigo \n "
						+ "4 - Ver abrigos \n "
						+ "0 - Sair \n"
						+ "---------x-x-x---------");

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

						System.out.println("---------x-x-x---------/n"
								+ "Digite o nome do abrigo/n"
								+ "---------x-x-x---------");

						sc.nextLine();
						shelterName = sc.nextLine();

						System.out.println("------------x-x-x------------\n"
								+ "Digite o endereço do abrigo\n"
								+ "------------x-x-x------------");

						shelterAddress = sc.nextLine();

						System.out.println("--------------x-x-x--------------\n"
								+ "Digite o responsavel do abrigo\n"
								+ "--------------x-x-x--------------");

						shelterManager = sc.nextLine();

						System.out.println("------------x-x-x------------\n"
								+ "Digite o telefone do abrigo\n"
								+ "------------x-x-x------------");

						shelterPhone = sc.nextLine();

						System.out.println("----------x-x-x----------/n"
								+ "Digite o email do abrigo/n"
								+ "----------x-x-x----------");

						shelterEmail = sc.nextLine();

						System.out.println("-------------x-x-x-------------/n"
								+ "Digite a capacidade do abrigo/n"
								+ "-------------x-x-x-------------");

						shelterCapacity = sc.nextInt();

						System.out.println("-----------x-x-x-----------/n"
								+ "Digite a ocupaçao do abrigo/n"
								+ "-----------x-x-x-----------");

						shelterOccupied = sc.nextInt();

						Abrigo a = new Abrigo(shelterName, shelterAddress, shelterManager, shelterPhone, shelterEmail,
								shelterCapacity, shelterOccupied);
						toAddShelters.add(a);

						System.out.println("------------------------x-x-x------------------------\n"
								+ "As informacoes enviadas serao verificadas, Obrigado.\n"
								+ "------------------------x-x-x------------------------");


						// Repetir
						System.out.println("---------x-x-x---------\n"
								+ "Desejas adicionar mais?\n "
								+ "1 - Sim \n "
								+ "0 - Nao\n"
								+ "---------x-x-x---------");

						cont = sc.nextInt();

					}
					break;
				// Autorizar abrigos
				case 2:

					while (cont != 0) {
						cont = -1;
						list = 0;
						System.out.println("------------------x-x-x------------------\n"
								+ "Qual desses abrigos pretendes autorizar?\n"
								+ "------------------x-x-x------------------");


						for (Abrigo s : toAddShelters) {
							list += 1;
							System.out.println(list + " - " + s);
						}

						Integer selectedShelter = sc.nextInt();

						// move o abrigo para a lista de abrigos autorizados e remove da lista de espera
						trustedShelters.add(toAddShelters.get(selectedShelter - 1));
						toAddShelters.remove(selectedShelter - 1);

						// Repetir
						System.out.println("---------x-x-x---------\n"
								+ "Desejas autorizar mais?\n "
								+ "1 - Sim \n "
								+ "0 - Nao\n"
								+ "---------x-x-x---------");

						cont = sc.nextInt();
					}

					break;
				case 3:
					while (cont != 0) {

						list = 0;
						System.out.println("------------------x-x-x------------------\n"
								+ "Qual desses abrigos pretendes recusar?\n"
								+ "------------------x-x-x------------------");


						for (Abrigo s : toAddShelters) {
							list += 1;
							System.out.println(list + " - " + s);
						}

						Integer selectedShelter = sc.nextInt();

						// Exclui o abrigo da lista de espera
						toAddShelters.remove(selectedShelter - 1);

						// Repetir
						System.out.println("---------x-x-x---------\n"
								+ "Desejas recusar mais?\n "
								+ "1 - Sim \n "
								+ "0 - Nao\n"
								+ "---------x-x-x---------");

						cont = sc.nextInt();
					}

					// Checar a lista de abrigos autorizados e a serem autorizados
				case 4:

					list = 0;

					System.out.println("-----------x-x-x------------\n"
							+ "Abrigos a serem autorizados\n"
							+ "-----------x-x-x------------");

					for (Abrigo s : toAddShelters) {
						list += 1;
						System.out.println(list + " - " + s);
					}

					list = 0;
					System.out.println("--------x-x-x--------\n"
							+ "Abrigos a autorizados\n"
							+ "--------x-x-x--------");

					for (Abrigo s : trustedShelters) {
						list += 1;
						System.out.println(list + " - " + s);
					}
					break;

				}
				break;
			//ABA CENTRO DE DISTRIBUICAO
			case 2:

				list = 0;

				System.out.println("------------x-x-x------------\n"
						+ "Qual centro de distribuicao ?"
						+ "\n------------x-x-x-----------");

				for (CentroDistribuicao s : centers) {
					list += 1;
					System.out.println(list + " - " + s);
				}

				Integer selectedCenter = sc.nextInt();

				cont = -1;
				System.out.println("---------x-x-x---------\n"
						+ "Oque pretendes fazer ?\n "
						+ "1 - Receber lote \n "
						+ "2 - Autorizar pedido \n "
						+ "3 - Recusar pedido \n "
						+ "4  - Ver pedidos \n "
						+ "0 - Sair \n"
						+ "---------x-x-x---------");

				centertab = sc.nextInt();

				switch (centertab) {
				case 1:
					
					centers.get(selectedCenter - 1).addItems();

					break;
				case 2:

				}
			break;
			case 3:
				Integer thislist = 0;

				System.out.println("------------x-x-x------------\n"
						+ "Qual centro de distribuicao ?\n"
						+ "------------x-x-x------------");


				for (CentroDistribuicao s : centers) {
					list += 1;
					System.out.println(list + " - " + s);
				}

				Integer selectedShelter = sc.nextInt();

				cont = -1;
				System.out.println("---------x-x-x---------\n"
						+ "Oque pretendes fazer ?\n "
						+ "1 - Receber lote \n "
						+ "2 - Autorizar pedido \n "
						+ "3 - Recusar pedido \n "
						+ "3 - Ver pedidos \n"
						+ " 0 - Sair \n"
						+ "---------x-x-x---------");

				managertab = sc.nextInt();

				switch (centertab) {}
				
			}
		}
		sc.close();
	}
	}
