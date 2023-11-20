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
	public void inserir(Matricula objeto) {}
	public void alterar(Matricula objeto) {}
	public void excluir(Matricula objeto) {}
public void excluirPorId(Integer id) {}
	public Matricula buscarPorId(Integer id) {return null;}
	public List<MatriculaControl> buscarTodos() {return null;}
	//outros métodos de busca que achar necessário
} 