package desafio.main;

import java.util.Scanner;

import desafio.entities.CentroDistribuicao;

public class Programa {

	public static void main(String[] args) {
		
		int entry = -1;
		int cont = -1;
		
		Scanner sc = new Scanner(System.in);
		
		//Gerando centros de distribuição
		CentroDistribuicao CD1 = new CentroDistribuicao("Centro de Distribuição Esperança","Av. Boqueirão",2450,"RS",92032-420);
		CentroDistribuicao CD2 = new CentroDistribuicao("Centro de Distribuição Prosperidade","Av. Borges de Medeiros",1501,"RS",90119-900);
		CentroDistribuicao CD3 = new CentroDistribuicao("Centro de Distribuição Reconstrução","R. Dr. Décio Martins Costa",312,"RS",94920-170);

		//Interface textual
		while (entry != 0) { 
		
		cont = -1;
		
		System.out.println("---------x-x-x---------");
		System.out.println("Oque prentendes fazer?\n 1 - Cadastrar Doacao \n 2 - Ler Doacoes \n 3 - Editar Doacoes \n 4 - Remover Doacoes \n 0 - Sair ");
		System.out.println("---------x-x-x---------");
		
		entry = sc.nextInt();
		
		//Sistema de menus
		switch (entry) {
		
		//Acicionar Doaçao
		case 1:
			
			while(cont != 0) {
			cont = -1;
			System.out.println("Doacao efetuada");
			System.out.println("---------x-x-x---------");
			System.out.println("Desejas adicionar mais?\n 1 - Sim \n 0 - Nao");
			System.out.println("---------x-x-x---------");
			cont = sc.nextInt();
			}
			
			break;
		case 2:
			
		//Ler Doaçao
			while(cont != 0) {
			cont = -1;
			System.out.println("Doacao lida");
			System.out.println("---------x-x-x---------");
			System.out.println("Desejas ler mais?\n 1 - Sim \n 0 - Nao");
			System.out.println("---------x-x-x---------");
			cont = sc.nextInt();
			}
			
			break;
		case 3:
			
		//Editar Doaçao
			while(cont != 0) {
			cont = -1;
			System.out.println("Doacao editada");
			System.out.println("---------x-x-x---------");
			System.out.println("Desejas editar mais?\n 1 - Sim \n 0 - Nao");
			System.out.println("---------x-x-x---------");
			cont = sc.nextInt();
			}
			
			break;
		case 4:
		
		//Remover Doacao
			while(cont != 0) {
			cont = -1;
			System.out.println("Doacao removida");
			System.out.println("---------x-x-x---------");
			System.out.println("Desejas editar mais?\n 1 - Sim \n 0 - Nao");
			System.out.println("---------x-x-x---------");
			cont = sc.nextInt();
			}
			
			break;
		}

	}

}

}
