package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemTema {
	@Id
	@GeneratedValue
	private int idItemTema;
	private String nome, descricao;

	@ManyToOne
	private Tema tema;
	
	public ItemTema() {
		// TODO Auto-generated constructor stub
	}

	public int getIdITema() {
		return idItemTema;
	}

	public void setIdTema(int idTema) {
		this.idItemTema = idTema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
