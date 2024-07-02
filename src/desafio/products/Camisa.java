package desafio.products;

import java.util.Scanner;

public class Camisa {

	String gender;
	String size;

	public Camisa(String seentry, String size) {
		this.gender = seentry;
		this.size = size;
	}

	public Camisa addCamisa() {

		Integer entry = -1;
		String g = null;
		String s = null;

		Scanner sc = new Scanner(System.in);

		while (entry != 0) {

			System.out.println("---------entry-entry-entry---------");
			System.out.println("Qual o genero da camisa?\n 1 - M \n 2 - F \n 0 - Cancelar ");
			System.out.println("---------entry-entry-entry---------");

			entry = sc.nextInt();

			if (entry == 1) {

				g = "M";

			} else if (entry == 2) {

				g = "F";

			}

			System.out.println("---------entry-entry-entry---------");
			System.out.println("Qual o tamanho da camisa?\n 1 - Infantil \n 2 - PP \n 3 - P \n 4 - M \n 5 - G \n 6 - GG \n 0 - Cancelar");
			System.out.println("---------entry-entry-entry---------");

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

		}
		
		sc.close();
		Camisa shirt = new Camisa(g, s);
		return shirt;
		
	}

}
