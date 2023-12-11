package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Matricula;

public class MatriculaControl {
	private EntityManager em;

	public MatriculaControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}

	public void inserir(Matricula objeto) {
		try {
			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void alterar(Matricula objeto) {
		try {
			em.getTransaction().begin();
			em.merge(objeto);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void excluir(Matricula objeto) {
		try {
			em.getTransaction().begin();
			em.remove(objeto);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void excluirPorId(Integer id) {
		try {
			Matricula objeto = buscarPorId(id);
			excluir(objeto);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Matricula buscarPorId(Integer id) {
		return em.find(Matricula.class, id);
	}

	public List<Matricula> buscarTodos() {
		String nomeClasse = Matricula.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
	}
	// outros métodos de busca que achar necessario.
}