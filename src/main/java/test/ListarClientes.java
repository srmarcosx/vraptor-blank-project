package test;

import java.util.List;

import dao.ClienteDAO;
import entity.Cliente;

public class ListarClientes {
public static void main(String[] args) {
	ClienteDAO dao = new ClienteDAO();
	List<Cliente> clientes = dao.consultaSemParametros(Cliente.CLIENTE_TODOS_ORDENADO_POR_NOME);
	System.out.println("|" + "ID" + "|" + "Nome" + "|" + "Telefone" + "|");
	for (Cliente cliente : clientes){
		System.out.println("|" + cliente.getIdCliente() + "|" + cliente.getNome() + "|" + cliente.getTelefone() + "|");
	}
	dao.finish();
}
}
