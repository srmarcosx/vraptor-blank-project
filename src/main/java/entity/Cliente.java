package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name = "Cliente.TodosOrdenadoPorNome", query = "select c from Cliente c order by c.nome")
public class Cliente {

	public static String CLIENTE_TODOS_ORDENADO_POR_NOME = "Cliente.TodosOrdenadoPorNome";

	@Id
	@GeneratedValue
	private int idCliente;
	private String nome;
	private String telefone;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
