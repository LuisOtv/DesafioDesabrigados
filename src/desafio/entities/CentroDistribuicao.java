package desafio.entities;

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

	Integer rice = 0;
	Integer bean = 0;
	Integer milk = 0;

	public CentroDistribuicao() {
	}

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

	public void addSoap(int s) {
		
		
		
		if (soap + s > 1000) {

			System.out.println("INVALIDO - PASSA DO LIMITE DE 1000, QUANTIDADE ATUAL : " + soap);

		} else {

			soap += s;
			System.out.println("ENVIADO - QUANTIDADE ATUAL : " + soap);

		}

	}

	public void addBrush(int s) {
		
		

		if (brush + s > 1000) {

			System.out.println("INVALIDO - PASSA DO LIMITE DE 1000, QUANTIDADE ATUAL : " + brush);

		} else {

			brush += s;
			System.out.println("ENVIADO - QUANTIDADE ATUAL : " + brush);

		}

	}

	public void addToothpaste(int s) {

		
		
		if (toothpaste + s > 1000) {

			System.out.println("INVALIDO - PASSA DO LIMITE DE 1000, QUANTIDADE ATUAL : " + toothpaste);

		} else {

			toothpaste += s;
			System.out.println("ENVIADO - QUANTIDADE ATUAL : " + toothpaste);

		}

	}
	
	public void addTampon(int s) {
		
		
		if (tampon + s > 1000) {

			System.out.println("INVALIDO - PASSA DO LIMITE DE 1000, QUANTIDADE ATUAL : " + tampon);

		} else {

			tampon += s;
			System.out.println("ENVIADO - QUANTIDADE ATUAL : " + tampon);

		}

	}

	public void addRice(int s) {
		
		
		if (rice + s > 1000) {

			System.out.println("INVALIDO - PASSA DO LIMITE DE 1000, QUANTIDADE ATUAL : " + rice);

		} else {

			rice += s;
			System.out.println("ENVIADO - QUANTIDADE ATUAL : " + rice);

		}

	}

	public void addBean(int s) {
		
		
		if (bean + s > 1000) {

			System.out.println("INVALIDO - PASSA DO LIMITE DE 1000, QUANTIDADE ATUAL : " + bean);

		} else {

			bean += s;
			System.out.println("ENVIADO - QUANTIDADE ATUAL : " + bean);

		}

	}

	public void addMilk(int s) {
		

		if (milk + s > 1000) {

			System.out.println("INVALIDO - PASSA DO LIMITE DE 1000, QUANTIDADE ATUAL : " + milk);

		} else {

			milk += s;
			System.out.println("ENVIADO - QUANTIDADE ATUAL : " + milk);

		}

	}

}
