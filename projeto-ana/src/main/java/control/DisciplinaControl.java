package control;

import javax.persistence.Persistence;
import model.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class DisciplinaControl {
	private EntityManager em;

	public DisciplinaControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	public void inserir(Disciplina objeto) {}
	public void alterar(Disciplina objeto) {}
	public void excluir(Disciplina objeto) {}
public void excluirPorId(Integer id) {}
	public Disciplina buscarPorId(Integer id) {return null;}
	public List<DisciplinaControl> buscarTodos() {return null;}
	//outros métodos de busca que achar necessário
}