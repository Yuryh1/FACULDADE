package testejpa;

public class Teste {

	public static void main(String[] args) {
		 
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		Cliente cliente = new Cliente();
		cliente.setNome("Hulk");
		cliente.setIdade(35);

		repositorioCliente.salvar(cliente);
	}

}
