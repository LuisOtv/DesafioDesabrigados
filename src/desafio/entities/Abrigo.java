package desafio.entities;

public class Abrigo {

	String name;
	String address;
	String manager;
	String phone;
	String email;
	Integer capacity;
	Integer occupied;

	// Itens
	Integer soap = 0;
	Integer brush = 0;
	Integer toothpaste = 0;
	Integer tampon = 0;

	Integer rice = 0;
	Integer bean = 0;
	Integer milk = 0;

	public Abrigo() {
	}

	public Abrigo(String name, String address, String manager, String phone, String email, Integer capacity,
			Integer occupied) {
		super();
		this.name = name;
		this.address = address;
		this.manager = manager;
		this.phone = phone;
		this.email = email;
		this.capacity = capacity;
		this.occupied = occupied;
	}

	@Override
	public String toString() {
		return "Nome: " + name + " Endereco: " + address + " Responsavel: " + manager + " Telefone: " + phone
				+ " Email: " + email + " Capacidade: " + capacity + " Preenchido: " + occupied + "\n";
	}

}
