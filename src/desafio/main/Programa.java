package desafio.main;

import java.util.ArrayList;
import java.util.Scanner;

import desafio.entities.Abrigo;
import desafio.entities.CentroDistribuicao;

public class Programa {

	public static void main(String[] args) {

		ArrayList<Abrigo> toAddShelters = new ArrayList<>();
		ArrayList<Abrigo> trustedShelters = new ArrayList<>();

		int entry = -1;
		int cont = -1;

		Scanner sc = new Scanner(System.in);

		// Gerando centros de distribuição
		CentroDistribuicao CD1 = new CentroDistribuicao("Centro de Distribuição Esperança", "Av. Boqueirão", 2450, "RS",
				92032 - 420);
		CentroDistribuicao CD2 = new CentroDistribuicao("Centro de Distribuição Prosperidade", "Av. Borges de Medeiros",
				1501, "RS", 90119 - 900);
		CentroDistribuicao CD3 = new CentroDistribuicao("Centro de Distribuição Reconstrução",
				"R. Dr. Décio Martins Costa", 312, "RS", 94920 - 170);

		// Interface textual
		while (entry != 0) {

			cont = -1;

			System.out.println("---------x-x-x---------");
			System.out.println(
					"Oque prentendes fazer?\n 1 - Cadastrar Doacao \n 2 - Ler Doacoes \n 3 - Editar Doacoes \n 4 - Remover Doacoes \n 5 - Adicionar Abrigo \n 6 - Autorizar Abrigos \n 0 - Sair ");
			System.out.println("---------x-x-x---------");

			entry = sc.nextInt();

			// Sistema de menus
			switch (entry) {

			// Acicionar Doaçao
			case 1:

				while (cont != 0) {
					cont = -1;
					System.out.println("------------------x-x-x------------------");
					System.out.println(
							"Qual o Centro de distribuicao?\n 1 - Centro de Distribuição Esperança \n 2 - Centro de Distribuição Prosperidade \n 3 - Centro de Distribuição Reconstrução \n 0 - Cancelar");
					System.out.println("------------------x-x-x------------------");
					cont = sc.nextInt();

				}

				break;
			case 2:

				// Ler Doaçao
				while (cont != 0) {
					cont = -1;
					System.out.println("Doacao lida");
					System.out.println("---------x-x-x---------");
					System.out.println("Desejas ler mais?\n 1 - Sim \n 0 - Nao");
					System.out.println("---------x-x-x---------");
					cont = sc.nextInt();
				}

				break;
			case 3:

				// Editar Doaçao
				while (cont != 0) {
					cont = -1;
					System.out.println("Doacao editada");
					System.out.println("---------x-x-x---------");
					System.out.println("Desejas editar mais?\n 1 - Sim \n 0 - Nao");
					System.out.println("---------x-x-x---------");
					cont = sc.nextInt();
				}

				break;
			case 4:

				// Remover Doacao
				while (cont != 0) {
					cont = -1;
					System.out.println("Doacao removida");
					System.out.println("---------x-x-x---------");
					System.out.println("Desejas editar mais?\n 1 - Sim \n 0 - Nao");
					System.out.println("---------x-x-x---------");
					cont = sc.nextInt();
				}

				break;

			case 5:

				while (cont != 0) {
					String shelterName = null;
					String shelterAddress = null;
					String shelterManager = null;
					String shelterPhone = null;
					String shelterEmail = null;
					Integer shelterCapacity = null;
					Integer shelterOccupied = null;

					// Adicionando Abrigo
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
					
					//Repetir
					System.out.println("---------x-x-x---------");
					System.out.println("Desejas adicionar mais?\n 1 - Sim \n 0 - Nao");
					System.out.println("---------x-x-x---------");

					cont = sc.nextInt();

					

				}
				break;
				
			case 6:

				// Remover Doacao
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
					
					//Autoriza o abrigo e remove da lista de espera
					trustedShelters.add(toAddShelters.get(selectedShelter - 1));
					toAddShelters.remove(selectedShelter - 1);	
					
					//Repetir
					System.out.println("---------x-x-x---------");
					System.out.println("Desejas autorizar mais?\n 1 - Sim \n 0 - Nao");
					System.out.println("---------x-x-x---------");
			
					cont = sc.nextInt();
				}

				break;
			}

		}

	}

}
