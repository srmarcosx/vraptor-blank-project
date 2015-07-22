package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tema {
@Id
@GeneratedValue
private int idTema;
private double valorAluguel;
private String corToalha;

@OneToMany
private List<ItemTema> itens;

public Tema() {
		// TODO Auto-generated constructor stub
}
public int getIdTema() {
	return idTema;
}
public void setIdTema(int idTema) {
	this.idTema = idTema;
}
public double getValorAluguel() {
	return valorAluguel;
}
public void setValorAluguel(double valorAluguel) {
	this.valorAluguel = valorAluguel;
}
public String getCorToalha() {
	return corToalha;
}
public void setCorToalha(String corToalha) {
	this.corToalha = corToalha;
}


}
