package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Aluguel {
	@Id
	@GeneratedValue
	private int idAluguel;
	private String dataFesta;
	private int horarioInicio;
	private double valorCobrado;

	@OneToOne
	private Endereco endereco;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Tema tema;
	
	public Aluguel() {
		// TODO Auto-generated constructor stub
	}

	public int getIdAluguel() {
		return idAluguel;
	}

	public void setIdAluguel(int idAluguel) {
		this.idAluguel = idAluguel;
	}

	public String getDataFesta() {
		return dataFesta;
	}

	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}

	public int getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(int horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

}
