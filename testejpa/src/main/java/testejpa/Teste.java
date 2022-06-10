package testejpa;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		 
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		List<Cliente> clientes = repositorioCliente.listarTodos();
		 
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}

}
}