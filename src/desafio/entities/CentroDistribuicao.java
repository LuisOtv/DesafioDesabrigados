package desafio.entities;

public class CentroDistribuicao {

	String name;
	String address;
	Integer number;
	String state;
	Integer cep;
	
	public CentroDistribuicao() {}

	public CentroDistribuicao(String name, String address, Integer number,String state, Integer cep) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.state = state;
		this.cep = cep;
	}
	
}
