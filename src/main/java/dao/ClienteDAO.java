package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Cliente;

public class ClienteDAO {

	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("jpa-hibernate-mysql-dev-local");
	EntityManager em;

	public void save(Cliente c) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Cliente c) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(c));
		em.getTransaction().commit();
		em.close();
	}

	public List<Cliente> list_all() {
		em = emf.createEntityManager();
		List<Cliente> result = em.createNamedQuery(
				Cliente.CLIENTE_TODOS_ORDENADO_POR_NOME, Cliente.class)
				.getResultList();
		em.close();
		return result;
	}
	
	public List<Cliente> consultaSemParametros(String nomeConsulta){
		em = emf.createEntityManager();
		return em.createNamedQuery(nomeConsulta, Cliente.class).getResultList();
	}

	public void finish() {
		emf.close();
	}
}