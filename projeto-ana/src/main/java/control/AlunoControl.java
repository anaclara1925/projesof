package control;

import java.util.List;
import model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoControl {
private EntityManager em;
	
	public  AlunoControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
}
	public void inserir(AlunoControl objeto) {}
	public void alterar(AlunoControl objeto) {}
	public void excluir(AlunoControl objeto) {}
public void excluirPorId(Integer id) {}
	public AlunoControl buscarPorId(Integer id) {return null;}
	public List<AlunoControl> buscarTodos() {return null;}
	//outros métodos de busca que achar necessário

}
